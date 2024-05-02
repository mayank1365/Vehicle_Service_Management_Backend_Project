package com.mayank.vehicle_service_management_backend.exceptions;

public class ServiceTypeAlreadyExistsException extends RuntimeException{
    public ServiceTypeAlreadyExistsException(String message){
        super(message);
    }
}
