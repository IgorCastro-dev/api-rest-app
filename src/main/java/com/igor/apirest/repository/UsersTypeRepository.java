package com.igor.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.apirest.model.UserType;

@Repository
public interface UsersTypeRepository extends JpaRepository<UserType, Integer>{

}
