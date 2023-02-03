package com.igor.apirest.mapper;

import com.igor.apirest.dto.SubscriptionsTypeDto;
import com.igor.apirest.model.SubscriptionsType;

public class SubscriptionsTypeMapper {
	
	public static SubscriptionsType fromDtoToEntity(SubscriptionsTypeDto subscriptionsTypeDto) {
		return SubscriptionsType.builder()
				.id(subscriptionsTypeDto.getId())
				.name(subscriptionsTypeDto.getName())
				.accessMonths(subscriptionsTypeDto.getAccessMonths())
				.price(subscriptionsTypeDto.getPrice())
				.productKey(subscriptionsTypeDto.getProductKey())
				.build();
	}
}
