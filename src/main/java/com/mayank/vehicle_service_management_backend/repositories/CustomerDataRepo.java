package com.mayank.vehicle_service_management_backend.repositories;

import com.mayank.vehicle_service_management_backend.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerDataRepo extends JpaRepository<Customer, Long> {
    @Override
    Customer save(Customer customer);

    @Override
    Optional<Customer> findById(Long id);

    //Optional<Customer> findCustomerByContactNumber(Long contactNumber);
    @Override
    void deleteById(Long id);

    Optional<Customer> findCustomerByContactNo(long contactNo);
}
