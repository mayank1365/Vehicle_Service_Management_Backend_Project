# Vehicle Service Management System
<hr>
This project is a backend application for managing vehicle services. It is built with Java, Spring Boot, and Maven.


## Technologies used
<hr>

* Java
* Spring Boot
* Maven
* MySQL


## Features
<hr>

* Spring Data JPA: Implements Spring Data JPA repositories for database operations.

* Web Interface: Provides a web interface accessible through Tomcat server.

## Table of Contents
<hr>

- [Installation and Setup](#installation-and-setup)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)



## Getting Started

### Prerequisites
<hr>

* Java 8 or higher
* MySQL
* Maven

### Installation and Setup
<hr>
1. Clone the repository:

   ```bash
   git clone https://github.com/mayank1365/Vehicle_Service_Management_Backend_Project
   ```

2. Navigate to the project directory:
   ```bash
   cd vehicle-service-management-backend
   ```

3. Build the project
    ```bash
    mvn clean install
    ```

4. Run the project
    ```bash
    mvn spring-boot:run
    ```

## Project Structure
<hr>
The project follows a typical Spring Boot project structure with the following key classes:

- `CustomerDataServiceImpl.java`: This class implements the `CustomerDataService` interface and provides the business logic for managing customers.
- `ServiceProviderService.java`: This is an interface that defines the methods for managing service providers.
- `ServiceProviderController.java`: This class is a REST controller that handles HTTP requests related to service providers.
- `CustomerController.java`: This class is a REST controller that handles HTTP requests related to customers. It includes methods for fetching a customer by ID, fetching all customers, deleting a customer by ID, and creating a new customer.

- `CustomerService.java`: This is an interface that defines the methods for managing customers. It is typically implemented by a service class, such as `CustomerServiceImpl.java`.

- `CustomerServiceImpl.java`: This class implements the `CustomerService` interface and provides the business logic for managing customers. It interacts with the repository layer to fetch, create, and delete customers.

- `VehicleController.java`: This class is a REST controller that handles HTTP requests related to vehicles. It includes methods for fetching a vehicle by ID, fetching all vehicles, deleting a vehicle by ID, and creating a new vehicle.

- `VehicleService.java`: This is an interface that defines the methods for managing vehicles. It is typically implemented by a service class, such as `VehicleServiceImpl.java`.

- `VehicleServiceImpl.java`: This class implements the `VehicleService` interface and provides the business logic for managing vehicles. It interacts with the repository layer to fetch, create, and delete vehicles.

- `ServiceRecordController.java`: This class is a REST controller that handles HTTP requests related to service records. It includes methods for fetching a service record by ID, fetching all service records, deleting a service record by ID, and creating a new service record.

- `ServiceRecordService.java`: This is an interface that defines the methods for managing service records. It is typically implemented by a service class, such as `ServiceRecordServiceImpl.java`.

- `ServiceRecordServiceImpl.java`: This class implements the `ServiceRecordService` interface and provides the business logic for managing service records. It interacts with the repository layer to fetch, create, and delete service records.

## API Endpoints and Exception Handling
<hr>

### Service Provider

- `GET /service-provider/{id}`: Fetches the service provider with the given ID.If the provider id is not found, it throws a `ServiceProviderNotFoundException` exception.
- `GET /service-provider`: Fetches all service providers.If the list is empty it throws a `ServiceProviderListEmptyException` exception.
- `DELETE /service-provider/{id}`: Deletes the service provider with the given ID.
- `POST /service-provider`: Creates a new service provider.If already exists, it throws a `ServiceProviderAlreadyExistsException` exception.



### Customer

- `GET /customer/{id}`: Fetches the customer with the given ID.
If the customer id is not found, it throws a `CustomerNotFoundException` exception.
- `GET /customer`: Fetches all customers.If the customer list is empty, it throws a `CustomerListEmptyException` exception.
- `DELETE /customer/{id}`: Deletes the customer with the given ID.
- `POST /customer`: Creates a new customer.If already exists, it throws a `CustomerAlreadyExistsException` exception.

### Vehicle

- `GET /vehicle`: Fetches all vehicles.If the vehicle list is empty, it throws a `VehicleListEmptyException` exception.
- `GET /vehicle/{id}`: Fetches the vehicle with the given ID.If the vehicle id is not found, it throws a `VehicleNotFoundException` exception.
- `DELETE /vehicle/{id}`: Deletes the vehicle with the given ID.
- `POST /vehicle`: Creates a new vehicle.If already exists, it throws a `OwnerMismatchException` exception.

### Service Record

- `GET /service-record`: Fetches all service records.If the service record list is empty, it throws a `ServiceRecordListEmptyException` exception.
- `GET /service-record/{id}`: Fetches the service record with the given ID.If the service record id is not found, it throws a `ServiceRecordNotFoundException` exception.
- `DELETE /service-record/{id}`: Deletes the service record with the given ID.
- `POST /service-record`: Creates a new service record.
### Service Type

- `GET /service-type`: Fetches all service types.If the service type list is empty, it throws a `ServiceTypeListEmptyException` exception.
- `GET /service-type/{id}`: Fetches the service type with the given ID.
- `DELETE /service-type/{id}`: Deletes the service type with the given ID.
- `POST /service-type`: Creates a new service type.If already exists, it throws a `ServiceTypeAlreadyExistsException` exception.








## Class Diagram
<hr>

![img_1 png](https://github.com/mayank1365/Vehicle_Service_Management_Backend_Project/assets/67086490/9891e7ea-8152-48af-b4d9-cc1ea526b962)





## Deployment
<hr>

To deploy the application to a production environment, you would typically build a deployable artifact such as a JAR file using Maven, and then deploy this artifact to your production environment.


## Contributing  
<hr>

If you would like to contribute to this project, please fork the repository and submit a pull request.


## Acknowledgements
<hr>

Thanks to all contributors and users of this project.


