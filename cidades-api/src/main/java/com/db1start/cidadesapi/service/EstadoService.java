package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public Estado criar(String nome) {
		Estado estado = new Estado(nome);
		return estadoRepository.save(estado);
	}
	
	public void limpar() {
		estadoRepository.deleteAll();
	}
	
	
	public void excluiPorId(Long id) {
		estadoRepository.deleteById(id);
	}
	
}
