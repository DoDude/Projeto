package br.edu.unoesc.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
public @Data class Funcionario extends Pessoa implements MinhaEntidade{
	private String usuario;
	private String senha;
	private String cargo;
	private Double salario;
	
}
