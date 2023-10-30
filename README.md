# Employee Management RESTful API

## Description

This is a RESTful API for an Employee Management System, built using Java and the Spring Boot framework. The project uses Gradle as the build tool. The API allows for creating, retrieving, updating, and deleting employee records.

## Installation

To install and run this project, you will need to have Java and Gradle installed on your machine. You can clone this repository using the following command:

```bash
git clone https://github.com/pritam1813/employee-management-restapi.git
```

Navigate into the project directory:

```bash
cd employee-management-restapi
```

You can then build the project using Gradle:

```bash
gradle build
```

And run the project using:

```bash
java -jar build/libs/employee-management-0.0.1-SNAPSHOT.jar
```

## Usage

This API provides the following endpoints:

- `GET /employees`: Fetches a list of all employees.
- `GET /employees/{id}`: Fetches details of an employee by ID.
- `POST /employees`: Creates a new employee record.
- `PUT /employees/{id}`: Updates an existing employee record by ID.
- `DELETE /employees/{id}`: Deletes an employee record by ID.

## Contributing

Contributions are welcome! Please read the contributing guidelines before getting started.

## License

This project is licensed under the terms of the MIT license.
