package com.igor.apirest.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "users")
public class Users implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String cpf;
	private LocalDate dt_subscription;
	private LocalDate dt_expiration;
	
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType userType;
	
	@ManyToOne
	@JoinColumn(name = "subscriptions_type_id")
	private SubscriptionsType subscriptionsType;
}
