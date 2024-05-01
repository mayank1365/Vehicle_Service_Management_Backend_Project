package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    public Vehicle createVehicle(Vehicle vehicle);
    public List<Vehicle> getAllVehicles();
    public Optional<Vehicle> getVehicleById(Long id);
    public void deleteVehicleById(Long id);
}
