# User Service
This is a User Service project built with Java, Spring Boot, and Maven. It provides functionalities for managing users, roles, and sessions.  
## Technologies Used
- Java
- Spring Boot
- Maven
- JPA (Java Persistence API)
- Hibernate
- SQL
## Getting Started
### Prerequisites
- Java 11 or higher
- Maven 3.6.0 or higher
- A SQL database (e.g., MySQL, PostgreSQL)
### Installation
1. Clone the repository:
```sh
git clone https://github.com/yourusername/userservice.git
cd userservice
```
2. Configure the database in
```sh
src/main/resources/application.properties:  
spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```
3. Build the project:
```sh
mvn clean install
```
4. Run the application:
```sh
mvn spring-boot:run
```
## Usage
### API Endpoints
- GET /api/users: Get all users
- POST /api/users: Create a new user
- GET /api/roles: Get all roles
- POST /api/roles: Create a new role
- GET /api/sessions: Get all sessions
- POST /api/sessions: Create a new session

## License
This project is licensed under the MIT License. See the LICENSE file for details.
