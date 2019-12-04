package com.wallet.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class WalletDTO {
	
	private Long id;
	
	@Length(min = 3, message = "Nome deve conter main de 3 caracteres.")
	@NotBlank(message = "O campo nome não pode ser nulo ou vazio")
	private String name;
	
	@NotNull(message = "Insira um valor para a carteira.")
	private BigDecimal value;
}
