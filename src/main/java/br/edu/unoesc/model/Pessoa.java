package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import lombok.Data;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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
	

}
