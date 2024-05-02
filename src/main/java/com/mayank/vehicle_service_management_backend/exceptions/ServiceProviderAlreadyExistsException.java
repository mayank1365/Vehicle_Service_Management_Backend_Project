package com.mayank.vehicle_service_management_backend.exceptions;

public class ServiceProviderAlreadyExistsException extends RuntimeException{
    public ServiceProviderAlreadyExistsException(String message){
        super(message);
    }
}
