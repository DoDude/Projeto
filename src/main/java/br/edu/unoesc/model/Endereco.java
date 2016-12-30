package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public @Data class Endereco implements MinhaEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long codigo;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="endereco", optional = true)
	private Fornecedor fornecedor;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="endereco", optional = true)
	private Pessoa pessoa;
}
