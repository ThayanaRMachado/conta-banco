package br.com.conta.banco.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.NumberFormat;

import br.com.conta.banco.modelo.Cliente;
import br.com.conta.banco.repository.ClienteRepository;

public class ClienteForm {

	private Long id;

	@NotEmpty
	@Size(min = 5)
	private String nome;

	@NotEmpty
	@Size(min = 4)
	private String sobrenome;

	@Email
	@Size(min = 12)
	private String email;

	@Size(min = 11, max = 11)
	@NumberFormat
	private String cnh;

	@CPF
	private String cpf;

	private String dataNascimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Cliente converter(ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.findByNome(nome);
		return new Cliente(id, nome, sobrenome, email, cnh, cpf, dataNascimento);
	}
}
