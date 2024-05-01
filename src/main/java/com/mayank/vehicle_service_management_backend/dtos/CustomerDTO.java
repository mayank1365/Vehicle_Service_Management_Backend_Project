package com.mayank.vehicle_service_management_backend.dtos;

import com.mayank.vehicle_service_management_backend.models.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerDTO {
    private String name;
    private long contactNumber;
    private List<Vehicle> vehicle;
}
