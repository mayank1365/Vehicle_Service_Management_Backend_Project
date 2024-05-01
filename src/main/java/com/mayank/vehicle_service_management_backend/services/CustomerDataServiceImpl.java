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
public class CustomerDataServiceImpl implements CustomerDataService{

    private CustomerDataRepo customerDataRepo;
    CustomerDataServiceImpl(CustomerDataRepo customerDataRepo){
        this.customerDataRepo = customerDataRepo;
    }
    @Override
    public Customer getCustomerById(Long id) {
        Optional<Customer> optionalCustomer = customerDataRepo.findById(id);
        if (optionalCustomer.isEmpty()) {
            throw new CustomerNotFoundException("User not found");
        }
        return optionalCustomer.get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> optionalCustomers = customerDataRepo.findAll();
        if(optionalCustomers.isEmpty()){
            throw new CustomerListEmptyException("customer list is empty");
        }
        return optionalCustomers;
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerDataRepo.deleteById(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        Optional<Customer> optionalCustomer = customerDataRepo.findCustomerByContactNumber(customer.getContactNumber());
        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("User already exists");
        }
        return customerDataRepo.save(customer);
    }


}
