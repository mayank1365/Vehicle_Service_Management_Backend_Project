package com.mayank.vehicle_service_management_backend.services;

import com.mayank.vehicle_service_management_backend.models.ServiceRecord;

import java.util.List;
import java.util.Optional;

public interface ServiceRecordService {
    public Optional<ServiceRecord> getServiceRecordById(Long id);
    public List<ServiceRecord> getAllServiceRecords();
    public void deleteServiceRecordById(Long id);
    public ServiceRecord createServiceRecord(ServiceRecord serviceRecord);
    Optional<ServiceRecord> updateServiceRecord(ServiceRecord serviceRecord);
}
