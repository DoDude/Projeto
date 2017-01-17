package br.edu.unoesc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

import javax.persistence.InheritanceType;


@Entity
public @Data class Pessoa implements MinhaEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long codigo;
	protected String nome;
	protected String cpf;
	protected String rg;
	protected String telefone1;
	protected String telefone2;
	protected String email;
	protected String genero;
	@OneToMany(mappedBy = "pessoa", targetEntity = Atendimento.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Atendimento> atendimentos;
	
	@OneToOne
	private Endereco endereco;
	
	@OneToMany(mappedBy = "cliente", targetEntity = Ordem.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Ordem> ordens;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="pessoa", optional = true)
	private Funcionario funcionario;

}
