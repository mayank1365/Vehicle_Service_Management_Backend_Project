package com.mayank.vehicle_service_management_backend.exceptions;

public class ServiceTypeListEmptyException extends RuntimeException{
    public ServiceTypeListEmptyException(String message){
        super(message);
    }
}
