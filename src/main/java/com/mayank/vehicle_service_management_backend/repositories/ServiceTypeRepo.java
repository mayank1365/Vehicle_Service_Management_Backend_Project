package com.mayank.vehicle_service_management_backend.repositories;

import com.mayank.vehicle_service_management_backend.models.ServiceType;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ServiceTypeRepo extends JpaRepository<ServiceType, Long>{

    @Override
    ServiceType save(ServiceType serviceType);

    @Override
    void deleteById(Long id);


}
