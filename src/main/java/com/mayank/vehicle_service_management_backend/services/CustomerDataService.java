package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerDataService {
    public Customer getCustomerById(Long id);
    public List<Customer> getAllCustomers();
    public void deleteCustomerById(Long id);
    public Customer createCustomer(Customer customer);
}
