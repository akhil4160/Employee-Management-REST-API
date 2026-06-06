# Employee Management REST API

A RESTful Employee Management API built using Spring Boot, Spring Data JPA, and MySQL.

## Features

- Create Employee
- Get All Employees
- Get Employee By ID
- Update Employee
- Delete Employee
- Request Validation
- Global Exception Handling
- DTO-based Architecture
- MySQL Database Integration

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

## API Endpoints

| Method | Endpoint | Description |
|----------|------------|------------|
| POST | /employees | Create Employee |
| GET | /employees | Get All Employees |
| GET | /employees/{id} | Get Employee By ID |
| PUT | /employees/{id} | Update Employee |
| DELETE | /employees/{id} | Delete Employee |

## Validation

- First Name cannot be blank
- Valid Email required
- Salary must be positive

## Exception Handling

Custom exception:

- EmployeeNotFoundException

Global exception handler returns meaningful error responses.

## Author

Akhil Agrawal
