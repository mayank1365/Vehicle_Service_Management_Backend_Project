package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.exceptions.ServiceProviderAlreadyExistsException;
import com.mayank.vehicle_service_management_backend.exceptions.ServiceProviderListEmptyException;
import com.mayank.vehicle_service_management_backend.exceptions.ServiceProviderNotFoundException;
import com.mayank.vehicle_service_management_backend.models.ServiceProvider;
import com.mayank.vehicle_service_management_backend.repositories.ServiceProviderRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceProviderServiceImpl implements ServiceProviderService{
    private ServiceProviderRepo serviceProviderRepo;

    public ServiceProviderServiceImpl(ServiceProviderRepo serviceProviderRepo){
        this.serviceProviderRepo = serviceProviderRepo;
    }

    @Override
    public Optional<ServiceProvider> getServiceProviderById(Long id) {
        Optional<ServiceProvider> optionalServiceProvider = serviceProviderRepo.findById(id);
        if (optionalServiceProvider.isEmpty()) {
            throw new ServiceProviderNotFoundException("Service Provider not found");
        }
        return optionalServiceProvider;
    }

    @Override
    public List<ServiceProvider> getAllServiceProviders() {
        List<ServiceProvider> serviceProviders = serviceProviderRepo.findAll();
        if (serviceProviders.isEmpty()) {
            throw new ServiceProviderListEmptyException("Service Provider List is Empty");
        }
        return serviceProviders;
    }

    @Override
    public void deleteServiceProviderById(Long id) {
        serviceProviderRepo.deleteById(id);
    }

    @Override
    public ServiceProvider createServiceProvider(ServiceProvider serviceProvider) {
        Optional<ServiceProvider> optionalServiceProvider = serviceProviderRepo.findServiceProvidersByContactNumber(serviceProvider.getContactNumber());
        if (optionalServiceProvider.isPresent()) {
            throw new ServiceProviderAlreadyExistsException("Service Provider Already Exists");
        }
        return serviceProviderRepo.save(serviceProvider);
    }
    @Override
    public Optional<ServiceProvider> updateServiceProvider(ServiceProvider serviceProvider) {
        Optional<ServiceProvider> existingServiceProvider = getServiceProviderById(serviceProvider.getServiceProviderId());
        serviceProviderRepo.save(serviceProvider);
        return Optional.of(serviceProvider);
    }
}
