package br.com.conta.banco.controller;

import java.net.URI;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.conta.banco.controller.dto.ClienteDto;
import br.com.conta.banco.controller.form.ClienteForm;
import br.com.conta.banco.modelo.Cliente;
import br.com.conta.banco.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	@Transactional
	public ResponseEntity<ClienteDto>cadastrar(@RequestBody ClienteForm form, UriComponentsBuilder uriBuilder){
		Cliente cliente = form.converter(clienteRepository);
		clienteRepository.save(cliente);
		URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getId()).toUri();
		return ResponseEntity.created(uri).body(new ClienteDto(cliente));
	}
	
}
