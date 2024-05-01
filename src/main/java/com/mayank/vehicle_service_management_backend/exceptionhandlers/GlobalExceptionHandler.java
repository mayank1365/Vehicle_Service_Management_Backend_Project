package com.mayank.vehicle_service_management_backend.exceptionhandlers;

import com.mayank.vehicle_service_management_backend.dtos.ExceptionDTO;
import com.mayank.vehicle_service_management_backend.exceptions.CustomerListEmptyException;
import com.mayank.vehicle_service_management_backend.exceptions.CustomerNotFoundException;
import com.mayank.vehicle_service_management_backend.exceptions.CustomerAlreadyExistsException;
import com.mayank.vehicle_service_management_backend.exceptions.VehicleNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handleUserNotFoundException(CustomerNotFoundException exception) {
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("user not found");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<ExceptionDTO> handleUserAlreadyExistsException(CustomerAlreadyExistsException exception) {
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("user already exists");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(CustomerListEmptyException.class)
    public ResponseEntity<ExceptionDTO> handleCustomerListEmptyException(CustomerListEmptyException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("customer list is empty");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(VehicleNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handleVehicleNotFoundException(VehicleNotFoundException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("vehicle not found");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDTO> handleGeneralException(){
        ExceptionDTO dto = new ExceptionDTO();
        dto.setResolution("general  exception");
        dto.setMessage("something went wrong");
        ResponseEntity<ExceptionDTO> response = new ResponseEntity<>(dto , HttpStatus.BAD_REQUEST);
        return response;
    }

}
