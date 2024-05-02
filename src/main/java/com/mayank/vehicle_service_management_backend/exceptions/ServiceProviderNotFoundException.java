package com.mayank.vehicle_service_management_backend.exceptions;

public class ServiceProviderNotFoundException extends RuntimeException{
    public ServiceProviderNotFoundException(String message){
        super(message);
    }
}
