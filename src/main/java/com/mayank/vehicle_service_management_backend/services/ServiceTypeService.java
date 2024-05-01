package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.ServiceType;

import java.util.List;

public interface ServiceTypeService {

    public List<ServiceType> getAllServiceTypes();
    public void deleteServiceTypeById(Long id);
    public ServiceType createServiceType(ServiceType serviceType);
}
