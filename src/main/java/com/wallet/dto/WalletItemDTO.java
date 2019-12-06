package com.wallet.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class WalletItemDTO {

	
	private Long id;
	
	@NotNull(message = "Insira o id da carteira.")
	private Long wallet;
	
	@NotNull(message = "Informe uma data.")
	private Date date;
	
	@NotNull(message = "Informe um tipo.")
	@Pattern(regexp = "^(ENTRADA|SAÍDA)$", message = "Para o tipo somente são aceitos Entrada ou Saída. ")
	private String type;
	
	@NotBlank(message = "A Descrição deve ter no mínimo 5 caracteres.")
	@Length(min = 5)
	private String description;
	
	@NotNull(message = "Informe um valor.")
	private BigDecimal value;
}
