package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.apache.commons.codec.digest.DigestUtils;

import lombok.Data;

@Entity
public @Data class Funcionario implements MinhaEntidade{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String usuario;
	private String senha;
	private String cargo;
	private Double salario;
	
	@ManyToOne
	@JoinColumn(name="ordem_codigo")
	private Ordem ordem;
	
	@OneToOne
	private Administrador administrador;
	
	@OneToOne
	private Pessoa pessoa;
	
	public void setSenha(String senhaParaCriptografar){
		this.senha = DigestUtils.md5Hex(senhaParaCriptografar);
	}

	public Funcionario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = DigestUtils.md5Hex(senha);
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
