package com.mayank.vehicle_service_management_backend.services;

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
    public Optional<Customer> getCustomerById(Long id) {
        return customerDataRepo.findById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDataRepo.findAll();
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerDataRepo.deleteById(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerDataRepo.save(customer);
    }


}
