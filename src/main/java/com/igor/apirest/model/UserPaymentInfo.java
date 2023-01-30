package com.igor.apirest.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_payment_info")
@Data
public class UserPaymentInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_payment_info_id")
	private int id;
	
	@Column(name = "card_number")
	private String cardNumber;
	
	@Column(name = "card_expiration_month")
	private int cardExpirationMonth;
	
	@Column(name = "card_expiration_year")
	private int cardExpirationYear;
	
	@Column(name = "cardSecurityCode")
	private String card_security_code;
	private BigDecimal price;
	private int instalments;
	
	@Column(name = "dt_payment")
	private LocalDate dtPayment;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private Users users;

}
