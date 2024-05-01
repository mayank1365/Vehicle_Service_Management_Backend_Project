package com.mayank.vehicle_service_management_backend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mayank.vehicle_service_management_backend.dtos.CustomerDTO;
import com.mayank.vehicle_service_management_backend.models.Customer;
import com.mayank.vehicle_service_management_backend.services.CustomerDataService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerDataService customerDataService;

    public CustomerController(CustomerDataService customerDataService){
        this.customerDataService = customerDataService;
    }

    @GetMapping("")
    public List<Customer> getAllCustomers() {
        return customerDataService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable Long id) {
        Customer customer = customerDataService.getCustomerById(id);
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setName(customer.getName());
        customerDTO.setContactNumber(customer.getContactNumber());
        customerDTO.setVehicle(customer.getVehicle());
        return customerDTO;
    }

    @DeleteMapping("/{id}")
    public String deleteCustomerById(@PathVariable Long id) {
        customerDataService.deleteCustomerById(id);
        return  "Customer Deleted Successfully!";
    }

    // Update the createCustomer method to return the created customer


    @PostMapping("")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerDataService.createCustomer(customer);
    }
}