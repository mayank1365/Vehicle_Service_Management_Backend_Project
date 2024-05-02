package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.exceptions.CustomerNotFoundException;
import com.mayank.vehicle_service_management_backend.exceptions.OwnerMismatchException;
import com.mayank.vehicle_service_management_backend.exceptions.VehicleListEmptyException;
import com.mayank.vehicle_service_management_backend.exceptions.VehicleNotFoundException;
import com.mayank.vehicle_service_management_backend.models.Customer;
import com.mayank.vehicle_service_management_backend.models.ServiceRecord;
import com.mayank.vehicle_service_management_backend.models.Vehicle;
import com.mayank.vehicle_service_management_backend.repositories.ServiceRecordRepo;
import com.mayank.vehicle_service_management_backend.repositories.VehicleRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{

    private VehicleRepo vehicleRepo;
    private ServiceRecordRepo serviceRecordRepo;
    public VehicleServiceImpl(VehicleRepo vehicleRepo){
        this.vehicleRepo = vehicleRepo;
    }
    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = vehicleRepo.findAll();
        if (vehicles.isEmpty()) {
            throw new VehicleListEmptyException("Vehicle list is empty");
        }
        return vehicles;
    }

    @Override
    public Optional<Vehicle> getVehicleById(Long id) {
        Optional<Vehicle> optionalVehicle = vehicleRepo.findById(id);
        if (optionalVehicle.isEmpty()) {
            throw new VehicleNotFoundException("Vehicle not found");
        }

        return optionalVehicle;
    }

    @Override
    public void deleteVehicleById(Long id) {
        vehicleRepo.deleteById(id);
    }

    @Override
    public Optional<Vehicle> updateVehicle(Vehicle vehicle) {
        Optional<Vehicle> existingVehicle = getVehicleById(vehicle.getVehicleId());
        if (existingVehicle.isEmpty()) {
            throw new VehicleNotFoundException("Vehicle not found");
        }

        if(vehicle.getOwner() != existingVehicle.get().getOwner()) {
            throw new OwnerMismatchException("Owner cannot be changed!!");
        }
        vehicleRepo.save(vehicle);
        return Optional.of(vehicle);
    }
    @Override
    public Optional<Vehicle> addRecord(Long id, ServiceRecord serviceRecord) {
        ServiceRecord record = serviceRecordRepo.save(serviceRecord);
        Optional<Vehicle> vehicle =  getVehicleById(id);
        List<ServiceRecord> serviceRecords = vehicle.get().getServiceRecord();
        serviceRecords.add(record);
        vehicle.get().setServiceRecord(serviceRecords);
        return vehicle;
    }

}
