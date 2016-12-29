package br.edu.unoesc.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
public @Data class Administrador extends Funcionario implements MinhaEntidade{
	protected Long codigo;
	private Boolean isAtivo;
}
