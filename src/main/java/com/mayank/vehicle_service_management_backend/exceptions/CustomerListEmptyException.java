package com.mayank.vehicle_service_management_backend.exceptions;

public class CustomerListEmptyException extends RuntimeException{
    public CustomerListEmptyException(String message){
        super(message);
    }
}
