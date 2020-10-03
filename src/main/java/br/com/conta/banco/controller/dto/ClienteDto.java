package br.com.conta.banco.controller.dto;

import br.com.conta.banco.modelo.Cliente;

public class ClienteDto {

	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String cnh;
	private String dataNascimento;

	public ClienteDto(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.sobrenome = cliente.getSobrenome();
		this.email = cliente.getEmail();
		this.cnh = cliente.getCnh();
		this.dataNascimento = cliente.getDataNascimento();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public String getCnh() {
		return cnh;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

}
