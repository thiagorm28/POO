package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente criar(String nome, String cpf, String telefone) {
		Cliente cliente = new Cliente(nome, cpf, telefone);
		return clienteRepository.save(cliente);
	}
	
	public void excluiPorId(Long id) {
		clienteRepository.deleteById(id);
	}
	
	public void procuraPorId(Long id) {
		clienteRepository.existsById(id);
	}


}
