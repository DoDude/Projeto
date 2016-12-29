package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public @Data class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long codigo;
	private String razao;
	private String cnpj;
	private String telefone1;
	private String telefone2;
	private String descricao;
	private Endereco endereco;
	
	@OneToOne
	private Lote lote;
}
