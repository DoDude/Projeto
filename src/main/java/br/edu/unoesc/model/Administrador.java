package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(name="codigo")
public @Data class Administrador extends Funcionario implements MinhaEntidade{
	private Boolean isAtivo;
	//private String usuario;
	//private String senha;
}
