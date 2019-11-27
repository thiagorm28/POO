package com.db1start.cidadesapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.CidadeService;

@SpringBootTest
public class CidadeServiceTest {
	
	Estado estado = new Estado("Paraná");
	
	@Autowired
	private CidadeService cidadeService;
	

	@Test
	void test() {
		Cidade cidade = cidadeService.criar("Maringá", estado);
		
		Assertions.assertNotNull(cidade);
		System.out.println(cidade.getId());
	}

}
