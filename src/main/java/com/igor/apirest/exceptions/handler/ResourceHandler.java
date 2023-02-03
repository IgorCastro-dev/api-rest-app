package com.igor.apirest.exceptions.handler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponseDto> methodArgumentNotValidException(MethodArgumentNotValidException m){
		Map<String, String> messages = new HashMap<>();
		m.getBindingResult().getAllErrors().forEach(error -> {
			String field = ((FieldError) error).getField();
			String defaultMessage = error.getDefaultMessage();
			messages.put(field, defaultMessage);
		});
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ErrorResponseDto.builder()
						.message(Arrays.toString(messages.entrySet().toArray()))
						.httpStatus(HttpStatus.BAD_REQUEST)
						.statusCode(HttpStatus.BAD_REQUEST.value())
						.build());
	}
}
