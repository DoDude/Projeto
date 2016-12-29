package br.edu.unoesc.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
public @Data class Produto implements MinhaEntidade{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long codigo;
	private String descricao;
	private String codigoInterno;
	private String temValidade;
	private LocalDateTime dt_fabricacao;
	private LocalDateTime dt_validade;
	
	@ManyToOne
	@JoinColumn(name="lote_codigo")
	private Lote lote;
	
	
}
