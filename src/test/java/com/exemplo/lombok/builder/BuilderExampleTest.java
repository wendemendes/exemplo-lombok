package com.exemplo.lombok.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuilderExampleTest {

	@Test
	public void test() {
		BuilderExample builderExample = new BuilderExample
		.BuilderExampleBuilder()
		.age(10)
		.name("João")
		.build();
		
		assertEquals(10, builderExample.getAge());
		assertEquals("João", builderExample.getName());
	}

}
