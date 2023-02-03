package com.igor.apirest.service;

import com.igor.apirest.dto.UsersDto;
import com.igor.apirest.model.Users;

public interface UsersService {
	
	Users create(UsersDto usersDto);
}
