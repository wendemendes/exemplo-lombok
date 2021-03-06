package com.exemplo.lombok.geterseter;

public class ClienteSemLombok {

	private Integer clienteKey;
	private String nome;
	private Long cpf;
	private Integer idade;
	private String email;
	
	public ClienteSemLombok() {
		
	}

	public Integer getClienteKey() {
		return clienteKey;
	}

	public void setClienteKey(Integer clienteKey) {
		this.clienteKey = clienteKey;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("%s (Idade: %d)", nome, idade);
	}

}
