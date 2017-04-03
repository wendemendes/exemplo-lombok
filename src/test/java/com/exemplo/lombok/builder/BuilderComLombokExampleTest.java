package com.exemplo.lombok.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuilderComLombokExampleTest {

	@Test
	public void test() {
		BuilderComLombokExample builderComLombokExample = new BuilderComLombokExample
		.BuilderComLombokExampleBuilder()
		.age(10)
		.name("Maria")
		.build();
		
		assertEquals(10, builderComLombokExample.getAge());
		assertEquals("Maria", builderComLombokExample.getName());
	}

}
