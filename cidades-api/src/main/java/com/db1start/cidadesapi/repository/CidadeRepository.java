package com.db1start.cidadesapi.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.EstadoService;

@Service
public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	Estado estado = new Estado("Paraná");
	
	public default Cidade criarCidade(String nome, Estado uf) {
		Cidade cidade = new Cidade(nome, uf);
		return save(cidade);
	}



}
