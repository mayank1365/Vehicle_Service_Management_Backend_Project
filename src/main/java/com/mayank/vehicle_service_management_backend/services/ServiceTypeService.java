package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.ServiceType;

import java.util.List;
import java.util.Optional;

public interface ServiceTypeService {

    List<ServiceType> getAllServiceTypes();
    void deleteServiceTypeById(Long id);
    ServiceType createServiceType(ServiceType serviceType);
    Optional<ServiceType> updateServiceType(ServiceType serviceType);
}

