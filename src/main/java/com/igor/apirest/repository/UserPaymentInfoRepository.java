package com.igor.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igor.apirest.model.UserPaymentInfo;


@Repository
public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Integer>{

}
