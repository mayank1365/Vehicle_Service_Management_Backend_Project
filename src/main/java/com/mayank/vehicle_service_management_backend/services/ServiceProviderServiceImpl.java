package com.mayank.vehicle_service_management_backend.services;

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
        return serviceProviderRepo.findById(id);
    }

    @Override
    public List<ServiceProvider> getAllServiceProviders() {
        return serviceProviderRepo.findAll();
    }

    @Override
    public void deleteServiceProviderById(Long id) {
        serviceProviderRepo.deleteById(id);
    }

    @Override
    public ServiceProvider createServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepo.save(serviceProvider);
    }
    @Override
    public Optional<ServiceProvider> updateServiceProvider(ServiceProvider serviceProvider) {
        Optional<ServiceProvider> existingServiceProvider = getServiceProviderById(serviceProvider.getServiceProviderId());
        serviceProviderRepo.save(serviceProvider);
        return Optional.of(serviceProvider);
    }
}
