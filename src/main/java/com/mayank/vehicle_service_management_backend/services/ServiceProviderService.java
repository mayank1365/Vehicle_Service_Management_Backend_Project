package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.ServiceProvider;

import java.util.List;
import java.util.Optional;

public interface ServiceProviderService {
    Optional<ServiceProvider> getServiceProviderById(Long id);
    List<ServiceProvider> getAllServiceProviders();
    void deleteServiceProviderById(Long id);
    ServiceProvider createServiceProvider(ServiceProvider serviceProvider);
    Optional<ServiceProvider> updateServiceProvider(ServiceProvider serviceProvider);
}