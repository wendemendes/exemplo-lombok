package com.exemplo.lombok.geterseter;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteSemLombokTest {

	private ClienteSemLombok clienteSemLombok = new ClienteSemLombok(); 
	
	@Test
	public void test() {
		clienteSemLombok.setIdade(22);
		clienteSemLombok.setNome("João");
		
		assertEquals(22, clienteSemLombok.getIdade().intValue());
		assertEquals("João", clienteSemLombok.getNome());
	}

}
