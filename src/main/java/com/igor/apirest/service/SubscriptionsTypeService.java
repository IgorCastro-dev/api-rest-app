package com.igor.apirest.service;

import java.util.List;

import com.igor.apirest.dto.SubscriptionsTypeDto;
import com.igor.apirest.model.SubscriptionsType;

public interface SubscriptionsTypeService {

	List<SubscriptionsType> findAll();
	
	SubscriptionsType findById(Integer id);
	
	SubscriptionsType create(SubscriptionsTypeDto subscriptionsTypeDto);
	
	SubscriptionsType update(Integer id,SubscriptionsTypeDto subscriptionsTypeDto);
	
	void delete(Integer id);

}
