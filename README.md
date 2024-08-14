# People API
A People API é uma aplicação desenvolvida em Java utilizando o framework Spring Boot. Esta API fornece funcionalidades para registrar, atualizar, encontrar e deletar pessoas em um sistema, utilizando um banco de dados MySQL.

## Funcionalidades
A API oferece as seguintes operações:

### 1 - Encontrar uma pessoa por ID
- Endpoint: GET /people/{id}
- Descrição: Recupera os detalhes de uma pessoa registrada no sistema com base no ID fornecido.

### 2 - Encontrar uma lista de pessoas
- Endpoint: GET /people
- Descrição: Recupera uma lista de todas as pessoas registradas no sistema.

### 3 - Registrar uma nova pessoa
- Endpoint: POST /people
- Descrição: Adiciona uma nova pessoa ao sistema com os dados fornecidos.

### 4 - Atualizar dados de uma pessoa
- Endpoint: PUT /people/{id}
- Descrição: Atualiza os dados de uma pessoa existente no sistema com base no ID fornecido.

### 5 - Deletar uma pessoa
- Endpoint: DELETE /people/{id}
- Descrição: Remove uma pessoa do sistema com base no ID fornecido.

## Tecnologias Usadas
- Java 22: Linguagem de programação utilizada para desenvolver a API.
- Spring Boot: Framework para criar aplicações Java de forma rápida e fácil.
- Maven: Ferramenta de gerenciamento e automação de projetos.
- MySQL: Sistema de gerenciamento de banco de dados relacional utilizado para armazenar os dados.

## Configuração
Para configurar e executar a API, siga os passos abaixo:

### Pré-requisitos
- JDK 22 instalado
- MySQL instalado e em execução
- Maven instalado

### Configuração do Banco de Dados
#### 1 - Crie um banco de dados no MySQL chamado people.
#### 2 - Atualize o arquivo application.properties com suas credenciais do MySQL:
```
properties
# Datasource
spring.datasource.url=jdbc:mysql://localhost:3306/people
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=update

# SQL
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
## Executando a Aplicação
- Clone o repositório:
```
git clone https://github.com/seu_usuario/people-api.git
```
- Navegue até o diretório do projeto:
```
cd people-api
```
- Compile e execute a aplicação com Maven:
```
mvn spring-boot:run
```
## Testando a API
Você pode testar os endpoints da API usando ferramentas como Postman ou cURL.

Aqui estão alguns exemplos de requisições:

- Encontrar uma pessoa por ID:

```
curl -X GET http://localhost:8080/people/1
```
- Encontrar uma lista de pessoas:
```
curl -X GET http://localhost:8080/people
```
- Registrar uma nova pessoa:
```
curl -X POST http://localhost:8080/people -H "Content-Type: application/json" -d '{"name": "John Doe", "age": 30}'
```
- Atualizar uma pessoa:
```
curl -X PUT http://localhost:8080/people/1 -H "Content-Type: application/json" -d '{"name": "John Doe", "age": 31}'
```
- Deletar uma pessoa:
```
curl -X DELETE http://localhost:8080/people/1
```
