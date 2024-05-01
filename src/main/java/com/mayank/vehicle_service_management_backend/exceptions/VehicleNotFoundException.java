package com.mayank.vehicle_service_management_backend.exceptions;

public class VehicleNotFoundException extends RuntimeException{
    public  VehicleNotFoundException(String message){
        super(message);
    }
}
