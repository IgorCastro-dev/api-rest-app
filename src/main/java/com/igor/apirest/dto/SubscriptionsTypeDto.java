package com.igor.apirest.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class SubscriptionsTypeDto {
	private Integer id;
	
	@NotBlank(message = "não pode ser vazio")
	@Size(min = 5,max = 30,message = "entre 5 e 30")
	private String name;
	
	@Max(value = 12,message = "não pode maior que 12")
	private Integer accessMonths;
	
	@NotNull(message = "não pode ser nulo")
	private BigDecimal price;
	
	@NotBlank(message = "não pode ser vazio")
	@Size(min = 5,max = 15, message = "entre 5 e 15")
	private String productKey;
}
