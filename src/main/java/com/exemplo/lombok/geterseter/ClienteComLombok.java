package com.exemplo.lombok.geterseter;

import lombok.Getter;
import lombok.Setter;



public class ClienteComLombok {

	@Setter @Getter
	private Integer clienteKey;
	
	@Setter @Getter
	private String nome;
	
	@Setter @Getter
	private Long cpf;
	
	@Setter @Getter
	private Integer idade;
	
	@Setter @Getter
	private String email;

}
