package com.mayank.vehicle_service_management_backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;

    private String company;
    private String model;
    private String year;

    @JsonIgnore
    @OneToMany
    private List<ServiceRecord> serviceRecord;

}
