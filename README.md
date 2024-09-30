

## Authentication and authorization example using spring boot 3

### Technologies used in development
-   Java
-   Spring boot
-   Lombok
-   Spring data mongodb
-   Spring security
-   MongoDB
-   JWT
- Maven
- OpenAPI 3.0
- Swagger

----------

### Motivation
This project aims to share with the developer community a practical example of JWT authentication and authorization using Spring Security.

----------

### Important Tips

- This is just an example, adapt it to your scenario and use case!
- The authorization configuration should be done from the highest level to the lowest. In other words, the configurations of lower levels authorization should come first, as exemplified in the `SecurityFilterChain` class.
- The token's key and expiration time must be configured in the `application.properties` file.

