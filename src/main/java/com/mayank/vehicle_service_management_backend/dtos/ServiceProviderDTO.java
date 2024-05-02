package com.mayank.vehicle_service_management_backend.dtos;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mayank.vehicle_service_management_backend.models.ServiceType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class ServiceProviderDTO {

    private String serviceProviderName;
    private List<ServiceType> serviceType;
    private Long contactNumber;
}
