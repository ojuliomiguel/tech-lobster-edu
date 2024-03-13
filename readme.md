# Tech Lobster Education 

Tech Lobster Education is a Spring Boot-based REST API designed to manage educational courses. It offers functionalities to create, list, update, and delete courses, along with the ability to activate or deactivate a course. This API is perfect for educational institutions, e-learning platforms, or any application that requires course management.

<div style="text-align: center;">
    <img src="https://i.ibb.co/GWpFH14/DALL-E-2024-03-13-14-25-22-A-school-in-the-USA-featuring-a-modern-tech-inspired-lobster-logo-on-its.webp" width="600px" hight="500px">
</div>

---

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:
- JDK 11 or newer
- Maven
- Your favorite IDE (Eclipse, IntelliJ, etc.)
- MySQL or any compatible database

### Setup

1. Clone the repository to your local machine:

```bash
git clone <repository-url>
```

2. Navigate into the project directory:

```bash
cd Tech Lobster Education
```

3. Update the `application.properties` file with your database connection details:

```properties
spring.datasource.url= Your Database URL
spring.datasource.username= Your Database Username
spring.datasource.password= Your Database Password
```

4. Build the project using Maven:

```bash
mvn clean install
```

5. Run the application:

```bash
mvn spring-boot:run
```

The application should now be running on `http://localhost:8080`.

## API Endpoints

### Create a Course

- **POST** `/cursos`

Creates a new course in the database. You need to provide `name` and `category` in the request body.

**Request Body Example:**

```json
{
  "name": "Introduction to Java",
  "category": "Programming"
}
```

### List Courses

- **GET** `/cursos`

Lists all the courses saved in the database. You can also filter courses by `name` and `category` by adding query parameters.

**Query Parameters Example:**

`GET /cursos?name=Java&category=Programming`

### Update a Course

- **PUT** `/cursos/:id`

Updates the name and/or category of an existing course by its ID. You should provide the new `name` and/or `category` in the request body. If `active` is provided, it will be ignored.

**Request Body Example:**

```json
{
  "name": "Advanced Java Programming"
}
```

### Delete a Course

- **DELETE** `/cursos/:id`

Removes a course from the database by its ID.

### Activate/Deactivate a Course

- **PATCH** `/cursos/:id/active`

Activates or deactivates a course by its ID. The request body should contain the `active` status.

**Request Body Example:**

```json
{
  "active": true
}
```

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues to improve the project.

---