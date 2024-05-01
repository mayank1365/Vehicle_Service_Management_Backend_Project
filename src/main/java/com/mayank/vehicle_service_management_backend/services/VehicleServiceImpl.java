package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.exceptions.CustomerNotFoundException;
import com.mayank.vehicle_service_management_backend.models.Customer;
import com.mayank.vehicle_service_management_backend.models.Vehicle;
import com.mayank.vehicle_service_management_backend.repositories.VehicleRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{

    private VehicleRepo vehicleRepo;
    public VehicleServiceImpl(VehicleRepo vehicleRepo){
        this.vehicleRepo = vehicleRepo;
    }
    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepo.findAll();
    }

    @Override
    public Optional<Vehicle> getVehicleById(Long id) {
        return vehicleRepo.findById(id);
    }

    @Override
    public void deleteVehicleById(Long id) {
        vehicleRepo.deleteById(id);
    }
}
