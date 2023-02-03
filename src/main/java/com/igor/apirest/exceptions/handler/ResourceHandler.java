package com.igor.apirest.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.igor.apirest.dto.error.ErrorResponseDto;
import com.igor.apirest.exceptions.NotFoundException;

@RestControllerAdvice
public class ResourceHandler {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorResponseDto> notFoundException(NotFoundException n){
		String erroMessage = n.getMessage();
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ErrorResponseDto.builder()
						.message(erroMessage)
						.httpStatus(HttpStatus.NOT_FOUND)
						.statusCode(HttpStatus.NOT_FOUND.value())
						.build());
	}
}
