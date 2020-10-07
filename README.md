# rest-api-server
Aplicação back-end(Java) para servir api rest (processo seletivo)


### Requisitos
- Java: 8
- Spring Boot: 2.3
- Tomcat: 8^ 
- PostgreSQL: 10^

### Notas
Para configurar a conexão com o banco de dados, acesso o arquivo
`application.properties` disponível em:\
`rest-api-server/src/main/resources/application.properties`.

Segue abaixo exemplo de configuração.

```
server.port=80

#Database
spring.datasource.url= jdbc:postgresql://localhost:5432/restapi
spring.datasource.username=default
spring.datasource.password=secret
spring.jpa.hibernate.ddl-auto=update

```
