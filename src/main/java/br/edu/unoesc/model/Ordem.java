package br.edu.unoesc.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public @Data class Ordem implements MinhaEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String descricao;
	private LocalDateTime dt_execucao;
	private LocalDateTime dt_finalizado;
	@OneToMany(mappedBy = "ordem", targetEntity = Funcionario.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Funcionario> funcionarioExecutante;
	
	@ManyToOne
	@JoinColumn(name="pessoa_codigo")
	private Pessoa cliente;
	
	
	@OneToMany(mappedBy = "ordem", targetEntity = ProdutoLote.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ProdutoLote> produtosUsados;
	
	
}
