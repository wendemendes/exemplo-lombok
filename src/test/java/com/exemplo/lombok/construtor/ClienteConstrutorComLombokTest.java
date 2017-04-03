package com.exemplo.lombok.construtor;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteConstrutorComLombokTest {

	@Test
	public void test() {
		
		ClienteConstrutorComLombok clienteConstrutorComLombok1 =  ClienteConstrutorComLombok.criar();
		assertNull(clienteConstrutorComLombok1.getNome());
		
		ClienteConstrutorComLombok clienteConstrutorComLombok2 =  ClienteConstrutorComLombok.criar();
		assertNotSame(clienteConstrutorComLombok1, clienteConstrutorComLombok2);
		
		ClienteConstrutorComLombok clienteConstrutorComLombok3 = new ClienteConstrutorComLombok("Maria");
		assertEquals("Maria", clienteConstrutorComLombok3.getNome());
	}

}
