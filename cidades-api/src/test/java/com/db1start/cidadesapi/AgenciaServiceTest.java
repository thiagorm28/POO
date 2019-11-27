package com.db1start.cidadesapi;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.AgenciaService;

@SpringBootTest
public class AgenciaServiceTest {
	
	Estado estado = new Estado("Paraná");
	Cidade cidade = new Cidade("Maringá", estado);
	List<Conta> contas = new ArrayList<>();
	@Autowired
	private AgenciaService agenciaService;

	@Test
	void test() {
		Agencia agencia = agenciaService.criar("123456", "03", "Banco Avenida", cidade, contas);
		
		Assertions.assertNotNull(agencia);
		System.out.println(agencia.getId());
	}

}
