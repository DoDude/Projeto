package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
public @Data class Administrador implements MinhaEntidade{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private Boolean isAtivo;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="administrador", optional = true)
	private Funcionario funcionario;
}
