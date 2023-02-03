package com.igor.apirest.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class SubscriptionsTypeDto {
	private String name;
	
	private Integer accessMonths;
	
	private BigDecimal price;
	
	private String productKey;
}
