package com.crud.people.controller;

import com.crud.people.dto.request.PersonRequestDTO;
import com.crud.people.dto.response.PersonResponseDTO;
import com.crud.people.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(value = "/people")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping(value = "/{id}")
    public ResponseEntity <PersonResponseDTO> findByid(@PathVariable Long id) {
        return ResponseEntity.ok().body(personService.findById(id));
    }

    @GetMapping

    public ResponseEntity<List<PersonResponseDTO>> findAll() {
        return ResponseEntity.ok().body(personService.findAll());
    }

    @PostMapping
    public ResponseEntity<PersonResponseDTO> register (@RequestBody PersonRequestDTO personRequestDTO, UriComponentsBuilder UriBuilder) {
        PersonResponseDTO personResponseDTO = personService.register(personRequestDTO);

        URI uri = UriComponentsBuilder
                .fromPath("/people/{id}")
                .buildAndExpand(personResponseDTO.getId())
                .toUri();
        return ResponseEntity.created(uri).body(personResponseDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PersonResponseDTO> update(@RequestBody PersonRequestDTO personDTO, @PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(personService.update(id, personDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(personService.delete(id));
    }
}
