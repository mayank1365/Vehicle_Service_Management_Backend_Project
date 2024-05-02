package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerDataService {
    Optional<Customer> getCustomerById(Long id);
    List<Customer> getAllCustomers();
    void deleteCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Optional<Customer> updateCustomer(Customer customer);
}
