package com.exemplo.lombok.data;

import lombok.Data;

@Data
public class ClienteDataComLombok {
	
	private Integer clienteKey;
	private String nome;
	private Long cpf;
	private Integer idade;
	private String email;
	
	public String getEmail() {
		return "maria@gmail.com";
	}

}
