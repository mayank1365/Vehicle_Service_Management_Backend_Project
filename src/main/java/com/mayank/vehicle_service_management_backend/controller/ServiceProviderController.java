package com.mayank.vehicle_service_management_backend.controller;

import com.mayank.vehicle_service_management_backend.dtos.ServiceProviderDTO;
import com.mayank.vehicle_service_management_backend.models.ServiceProvider;
import com.mayank.vehicle_service_management_backend.models.ServiceRecord;
import com.mayank.vehicle_service_management_backend.repositories.VehicleRepo;
import com.mayank.vehicle_service_management_backend.services.ServiceProviderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-provider")
public class ServiceProviderController {
    private final ServiceProviderService serviceProviderService;
    private final VehicleRepo vehicleRepo;

    public ServiceProviderController(ServiceProviderService serviceProviderService,
                                     VehicleRepo vehicleRepo){
        this.serviceProviderService = serviceProviderService;
        this.vehicleRepo = vehicleRepo;
    }

    @GetMapping("/{id}")
    public ServiceProviderDTO getServiceProviderById(@PathVariable Long id) {
        ServiceProvider serviceProvider = serviceProviderService.getServiceProviderById(id).get();
        ServiceProviderDTO serviceProviderDTO = new ServiceProviderDTO();
        serviceProviderDTO.setServiceProviderName(serviceProvider.getServiceProviderName());
        serviceProviderDTO.setServiceType(serviceProvider.getServiceType());
        serviceProviderDTO.setContactNumber(serviceProvider.getContactNumber());
        return serviceProviderDTO;


    }

    @GetMapping("")
    public List<ServiceProvider> getAllServiceProviders() {
        return serviceProviderService.getAllServiceProviders();
    }

    @DeleteMapping("/{id}")
    public String deleteServiceProviderById(@PathVariable Long id) {
        serviceProviderService.deleteServiceProviderById(id);
        return  "Service Provider Deleted Successfully!";
    }

    @PostMapping("")
    public ServiceProvider createServiceProvider(@RequestBody ServiceProvider serviceProvider) {
        return serviceProviderService.createServiceProvider(serviceProvider);
    }

}