package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(name="codigo")
@Inheritance(strategy = InheritanceType.JOINED)
public @Data class Funcionario extends Pessoa implements MinhaEntidade{
	private String usuario;
	private String senha;
	private String cargo;
	private Double salario;
	
}
