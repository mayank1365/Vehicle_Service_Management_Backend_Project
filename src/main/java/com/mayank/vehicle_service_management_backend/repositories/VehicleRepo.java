package com.mayank.vehicle_service_management_backend.repositories;

import com.mayank.vehicle_service_management_backend.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {
    @Override
    Vehicle save(Vehicle vehicle);
    @Override
    void deleteById(Long id);
    @Override
    Optional<Vehicle> findById(Long id);


}
