package com.igor.apirest.mapper;

import com.igor.apirest.dto.UsersDto;
import com.igor.apirest.model.SubscriptionsType;
import com.igor.apirest.model.UserType;
import com.igor.apirest.model.Users;

public class UsersMapper {
	
	public static Users fromDtoToEntity(UsersDto usersDto, UserType userType, SubscriptionsType subscriptionsType) {
		return Users.builder()
				.id(usersDto.getId())
				.name(usersDto.getName())
				.email(usersDto.getEmail())
				.phone(usersDto.getPhone())
				.cpf(usersDto.getCpf())
				.dt_expiration(usersDto.getDtExpiration())
				.dt_subscription(usersDto.getDtSubscription())
				.userType(userType)
				.subscriptionsType(subscriptionsType)
				.build();
	}
}
