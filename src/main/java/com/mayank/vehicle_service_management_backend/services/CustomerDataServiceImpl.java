package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.exceptions.CustomerAlreadyExistsException;
import com.mayank.vehicle_service_management_backend.exceptions.CustomerListEmptyException;
import com.mayank.vehicle_service_management_backend.exceptions.CustomerNotFoundException;
import com.mayank.vehicle_service_management_backend.models.Customer;
import com.mayank.vehicle_service_management_backend.repositories.CustomerDataRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerDataServiceImpl implements CustomerDataService {

    private CustomerDataRepo customerDataRepo;
    CustomerDataServiceImpl(CustomerDataRepo customerDataRepo){
        this.customerDataRepo = customerDataRepo;
    }
    @Override
    public Optional<Customer> getCustomerById(Long id) {
        Optional<Customer> existingCustomer = customerDataRepo.findById(id);
        if (existingCustomer.isEmpty()) {
            throw new CustomerNotFoundException("Customer with id " + id + " not found");
        }
        return existingCustomer;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerDataRepo.findAll();

        if (customers.isEmpty()) {
            throw new CustomerListEmptyException("Customer list is empty");
        }

        return customers;
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerDataRepo.deleteById(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        Optional<Customer> optionalCustomer = customerDataRepo.findCustomerByContactNo(customer.getContactNo());
        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already exists.");
        }
        return customerDataRepo.save(customer);
    }

    @Override
    public Optional<Customer> updateCustomer(Customer customer) {
        Optional<Customer> existingCustomer = getCustomerById(customer.getCustomerId());
        customerDataRepo.save(customer);
        return Optional.of(customer);
    }
}
