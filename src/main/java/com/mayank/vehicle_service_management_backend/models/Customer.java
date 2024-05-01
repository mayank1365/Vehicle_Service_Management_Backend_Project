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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    private String name;
    @OneToMany
    private List<Vehicle> vehicle;
    @OneToMany
    private List<ServiceRecord> serviceRecord;

}