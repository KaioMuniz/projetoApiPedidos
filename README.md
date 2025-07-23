# Projeto API Pedidos

Este projeto é uma API desenvolvida com o Spring Boot, utilizando JPA para persistência de dados e RabbitMQ para mensageria. A API se conecta a um banco de dados PostgreSQL e inclui uma documentação interativa utilizando OpenAPI.

## Dependências

Este projeto utiliza as seguintes dependências:

- **Spring Boot Starter Data JPA**: Para integração com banco de dados relacional utilizando JPA (Java Persistence API).
- **Spring Boot Starter Web**: Para a construção de APIs RESTful.
- **Spring Boot DevTools**: Ferramenta para auxiliar no desenvolvimento, com recarga automática de classes durante a execução.
- **PostgreSQL**: Conexão com o banco de dados PostgreSQL.
- **Spring Boot Starter Test**: Para realizar testes unitários na aplicação.
- **Springdoc OpenAPI**: Para gerar a documentação da API de forma interativa.
- **Spring Boot Starter AMQP**: Para integração com RabbitMQ.
- **Spring Rabbit Test**: Ferramenta para testes relacionados ao RabbitMQ.

## Como Rodar o Projeto

### Pré-requisitos

Antes de rodar o projeto, certifique-se de ter o seguinte instalado em sua máquina:

- [Java 17](https://adoptopenjdk.net/) ou superior
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/) (se for usar o Docker para o banco de dados)
- [PostgreSQL](https://www.postgresql.org/)

### Configuração do Banco de Dados

1. **Utilizando Docker**:
   - O arquivo `docker-compose.yml` está configurado para iniciar um container do PostgreSQL. Para rodar o banco de dados via Docker, execute o comando abaixo na raiz do projeto:

     ```bash
     docker-compose up -d
     ```

2. **Configurando a Conexão com o Banco**:
   - Certifique-se de configurar as credenciais do banco no arquivo `application.properties` ou `application.yml`, localizado em `src/main/resources`.

   Exemplo de configuração:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
   spring.datasource.username=usuario
   spring.datasource.password=senha
   spring.jpa.hibernate.ddl-auto=update
   ```

### Executando a Aplicação

1. Para rodar o projeto, use o Maven:

   ```bash
   ./mvnw spring-boot:run
   ```

2. A API estará disponível em `http://localhost:8080`.

### Testes

Para rodar os testes da aplicação, utilize o comando abaixo:

```bash
./mvnw test
```

## Documentação

A documentação da API está disponível através do Swagger UI, gerada pelo Springdoc OpenAPI. Após rodar a aplicação, acesse:

```
http://localhost:8080/swagger-ui.html
```

## Estrutura de Diretórios

- **`src`**: Código-fonte da aplicação.
- **`pom.xml`**: Arquivo de configuração do Maven, com as dependências do projeto.
- **`docker-compose.yml`**: Configuração para rodar o banco de dados PostgreSQL em um container Docker.

## Contribuição

Contribuições são bem-vindas! Caso queira contribuir, siga o fluxo de trabalho padrão do GitHub:

1. Fork o repositório.
2. Crie uma branch para a sua feature (`git checkout -b feature/nova-feature`).
3. Faça as alterações e envie um pull request.
