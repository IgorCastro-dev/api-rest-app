package com.igor.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igor.apirest.dto.SubscriptionsTypeDto;
import com.igor.apirest.model.SubscriptionsType;
import com.igor.apirest.service.SubscriptionsTypeService;


@RestController
@RequestMapping("api/subscriptionstype")
public class SubscriptionsTypeController {
	
	@Autowired
	private SubscriptionsTypeService subscriptionsTypeService;
	
	@GetMapping
	private ResponseEntity<List<SubscriptionsType>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(subscriptionsTypeService.findAll());
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<SubscriptionsType> finById(@PathVariable("id") Integer id){
			return ResponseEntity.status(HttpStatus.OK).body(subscriptionsTypeService.findById(id));
	}
	
	
	@PostMapping
	private ResponseEntity<SubscriptionsType> create(@RequestBody SubscriptionsTypeDto subscriptionsTypeDto){
		SubscriptionsType subscriptionsType = subscriptionsTypeService.create(subscriptionsTypeDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(subscriptionsType);
	}
	
	@PutMapping("/{id}")
	private ResponseEntity<SubscriptionsType> update(@PathVariable("id") Integer id,@RequestBody SubscriptionsTypeDto subscriptionsTypeDto){
		SubscriptionsType subscriptionsType = subscriptionsTypeService.update(id,subscriptionsTypeDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(subscriptionsType);
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<String> delete(@PathVariable("id") Integer id){
		subscriptionsTypeService.delete(id);
		return ResponseEntity.status(HttpStatus.OK).body("deletado");
	}
}







