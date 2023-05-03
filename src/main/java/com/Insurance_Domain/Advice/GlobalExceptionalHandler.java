package com.Insurance_Domain.Advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Insurance_Domain.Exception.ResourceNotFoundException;

@RestControllerAdvice
public class GlobalExceptionalHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handleResourceNotFoundExcpetion(ResourceNotFoundException ex){
		
	return new ResponseEntity<String>("Resource is not found", HttpStatus.BAD_REQUEST);
	}
}
