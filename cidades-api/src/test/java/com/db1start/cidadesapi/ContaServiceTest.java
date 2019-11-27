package com.db1start.cidadesapi;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.db1start.cidadesapi.domain.entity.Agencia;
import com.db1start.cidadesapi.domain.entity.Cidade;
import com.db1start.cidadesapi.domain.entity.Cliente;
import com.db1start.cidadesapi.domain.entity.Conta;
import com.db1start.cidadesapi.domain.entity.Estado;
import com.db1start.cidadesapi.service.ContaService;

@SpringBootTest
public class ContaServiceTest {
	
	Estado estado = new Estado("Paraná");
	Cidade cidade = new Cidade("Maringá", estado);
	List<Conta> contas = new ArrayList<>();
	Agencia agencia = new Agencia("123456", "03", "Banco Avenida", cidade, contas);
	Cliente cliente = new Cliente("Fake", "123456789", "34155248");
	@Autowired
	private ContaService contaService;

	@Test
	void test() {
		Conta conta = contaService.criar(agencia, 1045.50, cliente);
		
		Assertions.assertNotNull(conta);
		System.out.println(conta.getId());
	}

}
