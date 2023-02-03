package com.igor.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igor.apirest.dto.UsersDto;
import com.igor.apirest.model.Users;
import com.igor.apirest.service.UsersService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@PostMapping
	private ResponseEntity<Users> create(@Valid @RequestBody UsersDto usersDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usersService.create(usersDto));
	}
}
