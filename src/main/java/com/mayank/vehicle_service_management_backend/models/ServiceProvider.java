package com.mayank.vehicle_service_management_backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceProviderId;
    private String serviceProviderName;
    @OneToMany
    private List<ServiceType> serviceType;
    private String contactNumber;
}