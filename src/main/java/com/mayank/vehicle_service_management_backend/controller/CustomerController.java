package com.mayank.vehicle_service_management_backend.controller;

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
    public Customer getCustomerById(@PathVariable Long id) {
        return customerDataService.getCustomerById(id);
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