package com.exemplo.lombok.construtor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "criar")
@AllArgsConstructor
public class ClienteConstrutorComLombok {

	@Getter
	private String nome;
	
	

}
