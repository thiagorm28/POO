package com.db1start.cidadesapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.repository.CidadeRepository;


@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public Cidade criar(String nome, Estado uf) {
		Cidade cidade = new Cidade(nome, uf);
		return cidadeRepository.save(cidade);
	}
	
	public void excluiPorId(Long id) {
		cidadeRepository.deleteById(id);
	}
	
	public void procuraPorId(Long id) {
		cidadeRepository.existsById(id);
	}


}
