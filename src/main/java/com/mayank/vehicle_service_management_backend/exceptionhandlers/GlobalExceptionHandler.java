package com.mayank.vehicle_service_management_backend.exceptionhandlers;

import com.mayank.vehicle_service_management_backend.dtos.ExceptionDTO;
import com.mayank.vehicle_service_management_backend.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

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

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handleUserNotFoundException(CustomerNotFoundException exception) {
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("user not found");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(OwnerMismatchException.class)
    public ResponseEntity<ExceptionDTO> handleOwnerMismatchException(OwnerMismatchException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("owner mismatch");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.CONFLICT);
    }


    @ExceptionHandler(ServiceProviderAlreadyExistsException.class)
    public ResponseEntity<ExceptionDTO> handleServiceProviderAlreadyExistsException(ServiceProviderAlreadyExistsException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("service provider already exists");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ServiceProviderListEmptyException.class)
    public ResponseEntity<ExceptionDTO> handleServiceProviderListEmptyException(ServiceProviderListEmptyException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("service provider list is empty");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ServiceProviderNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handleServiceProviderNotFoundException(ServiceProviderNotFoundException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("service provider not found");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ServiceRecordListEmptyException.class)
    public ResponseEntity<ExceptionDTO> handleServiceRecordListEmptyException(ServiceRecordListEmptyException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("service record list is empty");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ServiceRecordNotFoundException.class)
    public ResponseEntity<ExceptionDTO> handleServiceRecordNotFoundException(ServiceRecordNotFoundException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("service record not found");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ServiceTypeAlreadyExistsException.class)
    public ResponseEntity<ExceptionDTO> handleServiceTypeAlreadyExistsException(ServiceTypeAlreadyExistsException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("service alrady exists");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ServiceTypeListEmptyException.class)
    public ResponseEntity<ExceptionDTO> handleServiceTypeListEmptyException(ServiceTypeListEmptyException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("service alrady exists");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(VehicleListEmptyException.class)
    public ResponseEntity<ExceptionDTO> handleVehicleListEmptyException(VehicleListEmptyException exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO();
        exceptionDTO.setMessage("something went wrong");
        exceptionDTO.setResolution("vehicle list empty");
        return new ResponseEntity<>(exceptionDTO, HttpStatus.BAD_REQUEST);
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