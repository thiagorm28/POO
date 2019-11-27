package com.db1start.cidadesapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.repository.AgenciaRepository;

@Service
public class AgenciaService {
	
	@Autowired
	private AgenciaRepository agenciaRepository;
	
	public Agencia criar(String numero, String digito, String banco, Cidade cidade, List<Conta> contas) {
		Agencia agencia = new Agencia(numero, digito, banco, cidade, contas);
		return agenciaRepository.save(agencia);
	}
	
	public void excluiPorId(Long id) {
		agenciaRepository.deleteById(id);
	}
	
	public void procuraPorId(Long id) {
		agenciaRepository.existsById(id);
	}

}
