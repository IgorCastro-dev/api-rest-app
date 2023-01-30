package com.igor.apirest.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "subscriptions_type")
public class SubscriptionsType implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subscriptions_type_id")
	private int id;
	
	private String name;
	
	@Column(name="access_months")
	private int accessMonths;
	
	private BigDecimal price;
	
	@Column(name = "product_key")
	private String productKey;

}
