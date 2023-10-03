# <h1 align = "center">  Employee Address API </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
</a>
    <img alt = "License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
    </a>
</p>


---

<p align="left">

## Overview

The  Employee Address API Application is a Spring Boot-based web application designed to help manage employee,address information. It allows users to perform various operations related to  Employee Address management, including adding new users and address, updating address, and deleting address,user from the system.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Employee Controller** `CREATE /Users` and GET/Users`
   
   This endpoint creare employee and get employee by using user id.

   ```java
   @Creating User
    @PostMapping("Create/Employee")
    public String addEmployee(@RequestBody Employee newEmployee){
        return employeeService.addEmployee(newEmployee);
    }

    @GetMapping("Get/Employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("Get/Employee/id/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
       return employeeService.getEmployeeById(id);
    }
    @PutMapping("update/Employee/id/{id}")
    public String updateEmployeeById(@PathVariable Long id,@RequestBody Employee newEmployee){
        return employeeService.updateEmployeeById(id,newEmployee);
    }
    @DeleteMapping("delete/employee/id/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
   ```

2. **Address Controller:** 

   This endpoint create a product and get all product and delete product such type of operation is in this.

   ```java
     @PostMapping("create/address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }
    @GetMapping("get/all/address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("get/address/id/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @DeleteMapping ("delete/address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
   ```
The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on restaurant data.
- Handling data transformations and interactions with external systems (if applicable).

### Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for restaurant data. Additionally, it may include data mapping and conversion between Java objects and database entities.

## Database Design

The project's database design includes tables for Employee and address management, with fields such as:

## Database Used

The project utilizes the following data structures:

### Model
1.Employee
2.Address

### MySql

The project

 utilizes the `MySql` data structure to store and manage lists of `Employee ` objects in various parts of the application. `MySql` provides permanent storage and efficient element retrieval, making it suitable for storing address and employee records and performing operations on them.

These database enable the application to organize and manipulate Ecommerce  data efficiently while maintaining data integrity.

## Project Summary

The  Employee Address API Application is a robust Spring Boot application designed for efficient data management. It offers a set of RESTful API endpoints for various restaurant-related operations, including adding, retrieving, updating, and deleting employee information.

Key Features:

- RESTful API endpoints for data management.
- Data validation to ensure data integrity.
- Clean code separation with a layered architecture (Controller, Services, Repository).
- Robust error handling for improved reliability.
- Java-based backend and Maven for build management.

The Employee Address  Management Application serves as a practical example of Spring Boot application development, demonstrating best practices in API design and data management. It offers a solid foundation for building and extending data management systems in various applications.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

## Contact
For questions or feedback, please contact [ROHIT SINGH BISHT](mailto:business.rohitbisht3502@gmail.com)


