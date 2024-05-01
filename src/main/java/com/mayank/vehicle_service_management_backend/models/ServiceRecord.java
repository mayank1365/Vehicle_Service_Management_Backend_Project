package com.mayank.vehicle_service_management_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@Entity
public class ServiceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceRecordId;

    @OneToOne
    private Vehicle vehicle;
    @ManyToMany
    private List<ServiceType> serviceType;
    private Date dateOfService;
}