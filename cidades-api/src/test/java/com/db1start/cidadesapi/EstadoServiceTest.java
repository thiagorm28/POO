package com.db1start.cidadesapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.EstadoService;

@SpringBootTest
public class EstadoServiceTest {
	
	@Autowired
	private EstadoService estadoService;

	@Test
	void test() {
		Estado estado = estadoService.criar("Paraná");
		
		Assertions.assertNotNull(estado);
		System.out.println(estado.getId());
	}

}
