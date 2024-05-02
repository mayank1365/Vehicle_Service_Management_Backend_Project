package com.mayank.vehicle_service_management_backend.exceptions;

public class ServiceRecordNotFoundException extends RuntimeException{
    public ServiceRecordNotFoundException(String message){
        super(message);
    }
}
