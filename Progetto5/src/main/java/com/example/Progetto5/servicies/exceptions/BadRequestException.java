package com.example.Progetto5.servicies.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class BadRequestException extends ApiException {
	private static final long serialVersionUID = 1L;

	private final List<ObjectError> errors;

	public BadRequestException(List<ObjectError> errors,List<ObjectError> errors1) {
		super(errors, HttpStatus.BAD_REQUEST, "Bad request");
		this.errors = errors1;
	}

}
