package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.ServiceType;
import com.mayank.vehicle_service_management_backend.repositories.ServiceTypeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    @Override
    public Optional<ServiceType> updateServiceType(ServiceType serviceType) {
        Optional<ServiceType> existingSystemType = serviceTypeRepo.findById(serviceType.getServiceTypeId());
        if (existingSystemType.isEmpty()) {
            throw new RuntimeException("ServiceType with id " + serviceType.getServiceTypeId() + " not found");
        }
        serviceTypeRepo.save(serviceType);
        return Optional.of(serviceType);
    }

}
