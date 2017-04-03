package com.exemplo.lombok.builder;

public class BuilderExample {

	private String name;
	private int age;

	BuilderExample(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static BuilderExampleBuilder builder() {
		return new BuilderExampleBuilder();
	}

	public static class BuilderExampleBuilder {
		private String name;
		private int age;

		BuilderExampleBuilder() {
		}

		public BuilderExampleBuilder name(String name) {
			this.name = name;
			return this;
		}

		public BuilderExampleBuilder age(int age) {
			this.age = age;
			return this;
		}

		public BuilderExample build() {
			return new BuilderExample(name, age);
		}
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}