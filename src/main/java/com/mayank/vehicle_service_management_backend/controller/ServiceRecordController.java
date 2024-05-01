package com.mayank.vehicle_service_management_backend.controller;

import com.mayank.vehicle_service_management_backend.dtos.ServiceRecordDTO;
import com.mayank.vehicle_service_management_backend.models.ServiceRecord;
import com.mayank.vehicle_service_management_backend.services.ServiceRecordService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service-record")
public class ServiceRecordController {

    private final ServiceRecordService serviceRecordService;

    public ServiceRecordController(ServiceRecordService serviceRecordService){
        this.serviceRecordService = serviceRecordService;
    }

    @GetMapping("/{id}")
    public Optional<ServiceRecordDTO> getServiceRecordById(@PathVariable Long id) {

        Optional<ServiceRecord> serviceRecord = serviceRecordService.getServiceRecordById(id);
        if(serviceRecord.isPresent()){
            ServiceRecordDTO serviceRecordDTO = new ServiceRecordDTO();
            serviceRecordDTO.setServiceRecordId(serviceRecord.get().getServiceRecordId());
            serviceRecordDTO.setVehicle(serviceRecord.get().getVehicle());
            serviceRecordDTO.setServiceType(serviceRecord.get().getServiceType());
            serviceRecordDTO.setDateOfService(serviceRecord.get().getDateOfService());
            serviceRecordDTO.setServiceStatus(serviceRecord.get().getServiceStatus());
            return Optional.of(serviceRecordDTO);
        }
        return Optional.empty();
    }

    @GetMapping("")
    public List<ServiceRecord> getAllServiceRecords() {
        return serviceRecordService.getAllServiceRecords();
    }

    @DeleteMapping("/{id}")
    public String deleteServiceRecordById(@PathVariable Long id) {
        serviceRecordService.deleteServiceRecordById(id);
        return "Service Record Deleted Successfully!";
    }

    @PostMapping("")
    public ServiceRecord createServiceRecord(@RequestBody ServiceRecord serviceRecord) {
        return serviceRecordService.createServiceRecord(serviceRecord);
    }

}