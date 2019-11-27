package com.db1start.cidadesapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
public class Agencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "numero")
	String numero;
	
	@Column(name = "digito")
	String digito;
	
	@Column(name = "banco")
	String banco;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	Cidade cidade;
	
	@OneToMany(mappedBy = "agencia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Conta> contas = new ArrayList<>();
	
	public Agencia(String numero, String digito, String banco, Cidade cidade, List<Conta> contas) {
		this.numero = numero;
		this.digito = digito;
		this.banco = banco;
		this.cidade = cidade;
	}
	
	public String getNumero() { return numero; }
	
	public String getDigito() { return digito; }
	
	public String getBanco() { return banco; }
	
	public Cidade getCidade() { return cidade; }
	
	public Long getId() { return id; }
}
