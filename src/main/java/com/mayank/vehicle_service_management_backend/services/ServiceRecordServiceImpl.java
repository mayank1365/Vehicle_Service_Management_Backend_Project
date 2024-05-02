package com.mayank.vehicle_service_management_backend.services;


import com.mayank.vehicle_service_management_backend.exceptions.ServiceRecordListEmptyException;
import com.mayank.vehicle_service_management_backend.exceptions.ServiceRecordNotFoundException;
import com.mayank.vehicle_service_management_backend.models.ServiceRecord;
import com.mayank.vehicle_service_management_backend.repositories.ServiceRecordRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceRecordServiceImpl implements ServiceRecordService {
    private ServiceRecordRepo serviceRecordRepo;

    public ServiceRecordServiceImpl(ServiceRecordRepo serviceRecordRepo){
        this.serviceRecordRepo = serviceRecordRepo;
    }
    @Override
    public Optional<ServiceRecord> getServiceRecordById(Long id) {
        Optional<ServiceRecord> optionalServiceRecord = serviceRecordRepo.findById(id);
        if (optionalServiceRecord.isEmpty()) {
            throw new ServiceRecordNotFoundException("Service Record not Found");
        }
        return optionalServiceRecord;
    }

    @Override
    public List<ServiceRecord> getAllServiceRecords() {
        List<ServiceRecord> serviceRecords = serviceRecordRepo.findAll();
        if (serviceRecords.isEmpty()) {
            throw new ServiceRecordListEmptyException("Service list is empty");
        }
        return serviceRecords;
    }

    @Override
    public void deleteServiceRecordById(Long id) {
        serviceRecordRepo.deleteById(id);
    }

    @Override
    public ServiceRecord createServiceRecord(ServiceRecord serviceRecord) {
        return serviceRecordRepo.save(serviceRecord);
    }
    @Override
    public Optional<ServiceRecord> updateServiceRecord(ServiceRecord serviceRecord) {
        Optional<ServiceRecord> existingServiceRecord = getServiceRecordById(serviceRecord.getServiceRecordId());
        serviceRecordRepo.save(serviceRecord);
        return Optional.of(serviceRecord);
    }
}
