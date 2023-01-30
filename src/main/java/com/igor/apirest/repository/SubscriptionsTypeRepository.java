package com.igor.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.apirest.model.SubscriptionsType;

@Repository
public interface SubscriptionsTypeRepository extends JpaRepository<SubscriptionsType, Integer>{

}
