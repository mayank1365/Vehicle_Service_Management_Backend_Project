package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.ServiceRecord;
import com.mayank.vehicle_service_management_backend.models.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    Vehicle createVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Optional<Vehicle> getVehicleById(Long id);
    void deleteVehicleById(Long id);
    Optional<Vehicle> updateVehicle(Vehicle vehicle);
    Optional<Vehicle> addRecord(Long id, ServiceRecord serviceRecord);

}
