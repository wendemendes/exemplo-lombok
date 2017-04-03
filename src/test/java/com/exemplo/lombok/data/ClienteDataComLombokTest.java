package com.exemplo.lombok.data;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteDataComLombokTest {

	@Test
	public void test() {
		ClienteDataComLombok clienteDataComLombok = new ClienteDataComLombok();
		
		clienteDataComLombok.setNome("maria");
		clienteDataComLombok.setEmail("teste@gmail.com");
		
		assertEquals("maria", clienteDataComLombok.getNome());
		assertEquals("maria@gmail.com", clienteDataComLombok.getEmail());
	}

}
