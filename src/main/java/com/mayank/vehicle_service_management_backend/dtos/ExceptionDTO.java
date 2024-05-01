package com.mayank.vehicle_service_management_backend.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ExceptionDTO {
    private String message;
    private String resolution;
}