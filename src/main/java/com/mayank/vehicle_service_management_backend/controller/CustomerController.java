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

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerDataService.getCustomerById(id);
    }

    @GetMapping("")
    public List<Customer> getAllCustomers() {
        return customerDataService.getAllCustomers();
    }

    @DeleteMapping("/{id}")
    public String deleteCustomerById(@PathVariable Long id) {
        customerDataService.deleteCustomerById(id);
        return  "Customer Deleted Successfully!";
    }

    @PostMapping("")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerDataService.createCustomer(customer);
    }

    @PutMapping("")
    public Optional<Customer> updateCustomer(@RequestBody Customer customer) {
        return customerDataService.updateCustomer(customer);
    }

}