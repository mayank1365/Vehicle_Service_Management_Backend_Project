package com.mayank.vehicle_service_management_backend.exceptions;

public class VehicleListEmptyException extends RuntimeException{
    public VehicleListEmptyException(String message){
        super(message);
    }
}
