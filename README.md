# Insurance_Domain
Project on Insurance Domain
The backend should be developed using Spring Boot and the Spring Data JPA framework.

The application should be secured using Spring Security with JWT token authentication.

The database should be MySQL or PostgreSQL.

The API should follow RESTful principles and be documented using Swagger.

The API should have the following endpoints:

/api/authenticate - to authenticate a user and return a JWT token

/api/customers - to get a list of all customers

/api/customers/{id} - to get a customer by ID

/api/customers/{id}/policies - to get a list of policies for a customer

/api/customers/{id}/claims - to get a list of claims for a customer

/api/policies - to get a list of all policies

/api/policies/{id} - to get a policy by ID

/api/policies - to create a new policy

/api/claims - to get a list of all claims

/api/claims/{id} - to get a claim by ID

/api/claims - to create a new claim

The API should use DTOs (Data Transfer Objects) to transfer data between the frontend and backend.

The API should have appropriate error handling and validation.
