package com.mayank.vehicle_service_management_backend.controller;

import com.mayank.vehicle_service_management_backend.models.ServiceType;
import com.mayank.vehicle_service_management_backend.services.ServiceTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/service-type")
public class ServiceTypeController {

    private final ServiceTypeService serviceTypeService;
    public ServiceTypeController(ServiceTypeService serviceTypeService){
        this.serviceTypeService = serviceTypeService;
    }

    @GetMapping
    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeService.getAllServiceTypes();
    }

    @DeleteMapping("/{id}")
    public String deleteServiceTypeById(@PathVariable Long id) {
        serviceTypeService.deleteServiceTypeById(id);
        return "Service Type Deleted Successfully!";
    }

    @PostMapping("")
    public ServiceType createServiceType(@RequestBody ServiceType serviceType) {
        return serviceTypeService.createServiceType(serviceType);
    }
    @PutMapping("")
    public Optional<ServiceType> updateServiceType(@RequestBody ServiceType serviceType) {
        return serviceTypeService.updateServiceType(serviceType);
    }

}