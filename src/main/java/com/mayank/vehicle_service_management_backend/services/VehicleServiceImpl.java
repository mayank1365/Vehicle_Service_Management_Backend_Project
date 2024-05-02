package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.exceptions.CustomerNotFoundException;
import com.mayank.vehicle_service_management_backend.exceptions.OwnerMismatchException;
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

    @Override
    public Optional<Vehicle> updateVehicle(Vehicle vehicle) {
        Optional<Vehicle> existingVehicle = getVehicleById(vehicle.getVehicleId());
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
