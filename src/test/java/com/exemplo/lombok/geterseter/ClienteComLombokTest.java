package com.exemplo.lombok.geterseter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteComLombokTest {
	
	private ClienteComLombok clienteComLombok = new ClienteComLombok(); 
	
	@Test
	public void test() {
		clienteComLombok.setIdade(22);
		clienteComLombok.setNome("João");
		
		assertEquals(22, clienteComLombok.getIdade().intValue());
		assertEquals("João", clienteComLombok.getNome());
	}

}
