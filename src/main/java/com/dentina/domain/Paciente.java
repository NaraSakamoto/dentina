package com.dentina.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente {

	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="TELEFONE")
	private Long telefone;
	
	@Column(name="TELEFONE2")
	private Long telefone2;
	
	@Column(name="CELULAR")
	private Long celular;
	
	@Column(name="DATA_NASC")
	private LocalDate dataNascimento;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="RECIBO")
	private boolean recibo;
	
	@Column(name="CONSULTORIO")
	private String consultorio;
	
	@Column(name="RESPONSAVEL")
	private String responsavel;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@Column(name="NUMERO")
	private String numero;
	
	@Column(name="COMPLEMENTO")
	private String complemento;
	
	

}
