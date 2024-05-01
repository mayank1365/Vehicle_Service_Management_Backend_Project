package com.mayank.vehicle_service_management_backend.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mayank.vehicle_service_management_backend.models.ServiceStatus;
import com.mayank.vehicle_service_management_backend.models.ServiceType;
import com.mayank.vehicle_service_management_backend.models.Vehicle;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ServiceRecordDTO {
    private Long serviceRecordId;
    private Vehicle vehicle;
    private ServiceType serviceType;
    private Date dateOfService;
    private ServiceStatus serviceStatus;
}
