package com.igor.apirest.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igor.apirest.dto.UsersDto;
import com.igor.apirest.exceptions.BadRequestException;
import com.igor.apirest.exceptions.NotFoundException;
import com.igor.apirest.mapper.UsersMapper;
import com.igor.apirest.model.Users;
import com.igor.apirest.repository.UsersRepository;
import com.igor.apirest.repository.UsersTypeRepository;
import com.igor.apirest.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UsersTypeRepository usersTypeRepository;
	
	@Override
	public Users create(UsersDto usersDto) {
		if(Objects.nonNull(usersDto.getId())) {
			throw new BadRequestException("o id tem que ser nulo");
		}
		
		var usersType = usersTypeRepository.findById(usersDto.getId());
		if (usersType.isEmpty()) {
			throw new NotFoundException("userType não existe");
		}
		Users users = UsersMapper.fromDtoToEntity(usersDto, usersType.get(),null);
		return usersRepository.save(users);
	}

}
