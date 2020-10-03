package br.com.conta.banco.controller.form;

import br.com.conta.banco.modelo.Cliente;
import br.com.conta.banco.repository.ClienteRepository;

public class ClienteForm {

	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String cnh;
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Cliente converter(ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.findByNome(nome);
		return new Cliente(id, nome, sobrenome, email, cnh, dataNascimento);
	}
}
