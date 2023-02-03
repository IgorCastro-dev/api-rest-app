package com.igor.apirest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igor.apirest.dto.SubscriptionsTypeDto;
import com.igor.apirest.exceptions.NotFoundException;
import com.igor.apirest.model.SubscriptionsType;
import com.igor.apirest.repository.SubscriptionsTypeRepository;
import com.igor.apirest.service.SubscriptionsTypeService;

@Service
public class SubscriptionsTypeServiceImplements implements SubscriptionsTypeService{
	
	@Autowired
	SubscriptionsTypeRepository subscriptionsTypeRepository;
	
	@Override
	public List<SubscriptionsType> findAll() {
		return subscriptionsTypeRepository.findAll();
	}

	@Override
	public SubscriptionsType findById(Integer id) {		
		return getSubscriptionsType(id);
	}

	@Override
	public SubscriptionsType create(SubscriptionsTypeDto subscriptionsTypeDto) {
		SubscriptionsType subscriptionsType = SubscriptionsType.builder()
				.name(subscriptionsTypeDto.getName())
				.accessMonths(subscriptionsTypeDto.getAccessMonths())
				.price(subscriptionsTypeDto.getPrice())
				.productKey(subscriptionsTypeDto.getProductKey())
				.build();
		return subscriptionsTypeRepository.save(subscriptionsType) ;
	}

	@Override
	public SubscriptionsType update(Integer id, SubscriptionsTypeDto subscriptionsTypeDto) {
		getSubscriptionsType(id);
		SubscriptionsType subscriptionsType = SubscriptionsType.builder()
				.id(id)
				.name(subscriptionsTypeDto.getName())
				.accessMonths(subscriptionsTypeDto.getAccessMonths())
				.price(subscriptionsTypeDto.getPrice())
				.productKey(subscriptionsTypeDto.getProductKey())
				.build();
		return subscriptionsTypeRepository.save(subscriptionsType) ;
	}

	@Override
	public void delete(Integer id) {
		getSubscriptionsType(id);
		subscriptionsTypeRepository.deleteById(id);
		
	}
	
	private SubscriptionsType getSubscriptionsType(Integer id) {
		Optional<SubscriptionsType> subscriptionsTypeOptional = subscriptionsTypeRepository.findById(id);
		if (subscriptionsTypeOptional.isEmpty()){
			throw new NotFoundException("não encontrado");
		}
		return subscriptionsTypeOptional.get();
	}
}
