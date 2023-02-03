package com.igor.apirest.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
	private Integer id;
	
	@NotBlank(message = "não pode vazio")
	@Size(min = 6,message = "tamanho maior que 6")
	private String name;
	
	@Email(message = "email inválido")
	private String email;
	
	@Size(min = 11,message = "tamanho maior que 11")
	private String phone;
	
	@CPF(message = "cpf inválido")
	private String cpf;
	
	@Builder.Default
	private LocalDate dtSubscription = LocalDate.now();
	
	@Builder.Default
	private LocalDate dtExpiration = LocalDate.now();
	
	@NotNull(message = "não pode nulo")
	private Integer userTypeid;
	
	private Integer subscriptionsTypeid;
}
