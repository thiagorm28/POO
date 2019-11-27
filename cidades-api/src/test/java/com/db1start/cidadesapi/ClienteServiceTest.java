package com.db1start.cidadesapi;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.ClienteService;

@SpringBootTest
public class ClienteServiceTest {
	
	Estado estado = new Estado("Paraná");
	Cidade cidade = new Cidade("Maringá", estado);
	List<Conta> contas = new ArrayList<>();
	@Autowired
	private ClienteService clienteService;

	@Test
	void test() {
		Cliente cliente = clienteService.criar("Fake", "123456789", "34155248");
		
		Assertions.assertNotNull(cliente);
		System.out.println(cliente.getId());
	}

}
