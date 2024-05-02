package com.mayank.vehicle_service_management_backend.exceptions;

public class ServiceProviderListEmptyException extends RuntimeException{
    public ServiceProviderListEmptyException(String message){
        super(message);
    }
}
