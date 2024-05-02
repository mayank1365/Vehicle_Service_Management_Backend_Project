package com.mayank.vehicle_service_management_backend.exceptions;

public class ServiceRecordListEmptyException extends RuntimeException{
    public ServiceRecordListEmptyException(String message){
        super(message);
    }
}
