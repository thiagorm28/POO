package com.db1start.cidadesapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "agencia_id")
	private Agencia agencia;
	
	@Column(name = "saldo")
	private Double saldo;
	
	@OneToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	public Conta(Agencia agencia, Double saldo, Cliente cliente) {
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public Agencia getAgencia() { return agencia; }
	
	public Double getSaldo() { return saldo; }
	
	public Cliente getCliente() { return cliente; }
	
	public Long getId() { return id; }

}
