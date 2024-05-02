package com.mayank.vehicle_service_management_backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
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
    private Date year;
    @ManyToOne
    private Customer owner;
    @OneToMany
    private List<ServiceRecord> serviceRecord;

}
//
//{
//        "company": "hoso",
//        "model": "M2",
//        "year": "2023-08-04T12:00:00.000Z",
//        "owner": 2,
//        "serviceRecord": {
//
//        }
//        }