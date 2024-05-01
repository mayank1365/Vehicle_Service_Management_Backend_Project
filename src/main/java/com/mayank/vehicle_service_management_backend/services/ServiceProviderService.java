package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.ServiceProvider;

import java.util.List;
import java.util.Optional;

public interface ServiceProviderService {
    public Optional<ServiceProvider> getServiceProviderById(Long id);
    public List<ServiceProvider> getAllServiceProviders();
    public void deleteServiceProviderById(Long id);
    public ServiceProvider createServiceProvider(ServiceProvider serviceProvider);
}