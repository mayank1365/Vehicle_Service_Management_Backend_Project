package com.mayank.vehicle_service_management_backend.exceptions;

public class OwnerMismatchException extends RuntimeException{
    public OwnerMismatchException(String message) {
        super(message);
    }
}
