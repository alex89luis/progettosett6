package com.example.Progetto5.servicies.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class ApiException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public final List<ObjectError> errorList;
    public final HttpStatus status;

    public ApiException(List<ObjectError> errorList){
        this(errorList,HttpStatus.SERVICE_UNAVAILABLE,"Api non valido");
    }


    public ApiException(List<ObjectError> errorList, HttpStatus status, String message) {
        super(message);
        this.errorList = errorList;
        this.status = status;
    }
}
