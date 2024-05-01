package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.ServiceType;
import com.mayank.vehicle_service_management_backend.repositories.ServiceTypeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService{
    private ServiceTypeRepo serviceTypeRepo;

    public ServiceTypeServiceImpl(ServiceTypeRepo serviceTypeRepo){
        this.serviceTypeRepo = serviceTypeRepo;
    }

    @Override
    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeRepo.findAll();
    }

    @Override
    public void deleteServiceTypeById(Long id) {
        serviceTypeRepo.deleteById(id);
    }

    @Override
    public ServiceType createServiceType(ServiceType serviceType) {
        return serviceTypeRepo.save(serviceType);
    }
}
