package com.db1start.cidadesapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "telefone")
	private String telefone;
	
	
	public Cliente (String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;;
	}
	
	public String getNome() { return nome; }
	
	public String getCpf() { return cpf; }
	
	public String getTelefone() { return telefone; }
	
	public Long getId() { return id; }
	
}
