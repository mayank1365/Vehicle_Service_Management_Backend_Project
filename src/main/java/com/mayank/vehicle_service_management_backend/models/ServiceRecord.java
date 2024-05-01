package com.mayank.vehicle_service_management_backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private ServiceType serviceType;
    private Date dateOfService;
    private ServiceStatus serviceStatus;

}