package com.crud.people.service;


import com.crud.people.dto.request.PersonRequestDTO;
import com.crud.people.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

   PersonResponseDTO register(PersonRequestDTO personRDTO);

    PersonResponseDTO update ( Long id, PersonRequestDTO personDTO);

    String delete(Long id);
}
