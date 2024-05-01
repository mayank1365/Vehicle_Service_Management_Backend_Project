package com.mayank.vehicle_service_management_backend.exceptions;

public class CustomerAlreadyExistsException extends RuntimeException{
    public CustomerAlreadyExistsException(String message){

        super(message);
    }
}