package com.mayank.vehicle_service_management_backend.repositories;

import com.mayank.vehicle_service_management_backend.models.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceProviderRepo extends JpaRepository<ServiceProvider, Long> {

    @Override
    ServiceProvider save(ServiceProvider serviceProvider);

    @Override
    void deleteById(Long id);

    @Override
    Optional<ServiceProvider> findById(Long id);

    Optional<ServiceProvider> findServiceProvidersByContactNumber(Long contactNo);
}
