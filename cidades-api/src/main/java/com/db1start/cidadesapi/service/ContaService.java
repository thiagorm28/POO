package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.repository.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository contaRepository;
	
	
	public Conta criar(Agencia agencia, Double saldo, Cliente cliente) {
		Conta conta = new Conta(agencia, saldo, cliente);
		return contaRepository.save(conta);
	}
	
	public void excluiPorId(Long id) {
		contaRepository.deleteById(id);
	}
	
	public void procuraPorId(Long id) {
		contaRepository.existsById(id);
	}
	

}
