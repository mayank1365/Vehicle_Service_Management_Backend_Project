package com.mayank.vehicle_service_management_backend.controller;

import com.mayank.vehicle_service_management_backend.models.Vehicle;
import com.mayank.vehicle_service_management_backend.services.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    private final VehicleService vehicleService;
    VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @GetMapping("/{id}")
    public Optional<Vehicle> getVehicleById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }

    @GetMapping("")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @DeleteMapping("/{id}")
    public String deleteVehicleById(@PathVariable Long id) {
        vehicleService.deleteVehicleById(id);
        return "Vehicle Deleted Successfully!";
    }

    @PostMapping("")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.createVehicle(vehicle);
    }

    @PutMapping("")
    public Optional<Vehicle> updateVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.updateVehicle(vehicle);
    }


}
