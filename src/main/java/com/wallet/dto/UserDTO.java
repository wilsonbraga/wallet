package com.wallet.dto;




import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
	
	private Long id;
	
	
	@NotNull
	@Length(min = 5 , message = "A senha deve conter no mínimo 6 caracteres.")
	private String password;
	
	@NotBlank(message = "O campo do nome não pode ser nulo ou vazio")
	@Length(min = 3, max = 80, message = "O nome deve conter entre 3 e 80 caracteres.")
	private String name;
	
	@Email(message = "Email inválido")
	@NotBlank(message = "O campo do email não pode ser nulo ou vazio")
	private String email;
}
