package com.wallet.dto;




import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class UserDTO {
	
	private Long id;
	
	@NotNull
	@Length(min = 5 , message = "A senha deve conter no mínimo 6 caracteres.")
	private String password;
	
	@Length(min = 3, max = 80, message = "O nome deve conter entre 3 e 80 caracteres.")
	private String name;
	
	@Email(message = "Email inválido")
	private String email;
}
