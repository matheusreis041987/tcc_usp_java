package com.tcc.usp.api.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
/*
@Entity
@Table(name= "processo", schema = "sch_processos")
public class Processo {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="nome")
	private String nome;
	
	@Column(name = "eh_dado_sensivel")
	private boolean eh_dado_sensivel;
	
	@Column(name = "data_criacao")
	private LocalDate data_criacao;
	
	@Column(name = "data_atualizacao")
	private LocalDate data_atualizacao;
	// CRIAR MÉTIDO PARA INSERIR A DATA DO MOMENTO0 DA ATUALIZAÇÃO
	
	@Column(name = "proc_compra")
	private String proc_compra;
	
	@Column(name = "controle")
	private String controle;
	
	@Column(name = "nome_org_transf")
	private String nome_org_transf;
	
	@OneToMany
	@JoinColumn(name = "id_responsavel", referencedColumnName = "id")
	private Responsavel responsavel;
	
	@Column(name = "obj_proc_compra")
	private String obj_proc_compra;
	
	@Column(name = "descricao_controle")
	private String descricao_controle;
	
	@Column(name = "pais_org_transf")
	private String pais_org_transf;
	
	@Column(name = "dado_org_transf")
	private String dado_org_transf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isEh_dado_sensivel() {
		return eh_dado_sensivel;
	}

	public void setEh_dado_sensivel(boolean eh_dado_sensivel) {
		this.eh_dado_sensivel = eh_dado_sensivel;
	}

	public LocalDate getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(LocalDate data_criacao) {
		this.data_criacao = data_criacao;
	}

	public LocalDate getData_atualizacao() {
		return data_atualizacao;
	}

	public void setData_atualizacao(LocalDate data_atualizacao) {
		this.data_atualizacao = data_atualizacao;
	}

	public String getProc_compra() {
		return proc_compra;
	}

	public void setProc_compra(String proc_compra) {
		this.proc_compra = proc_compra;
	}

	public String getControle() {
		return controle;
	}

	public void setControle(String controle) {
		this.controle = controle;
	}

	public String getNome_org_transf() {
		return nome_org_transf;
	}

	public void setNome_org_transf(String nome_org_transf) {
		this.nome_org_transf = nome_org_transf;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public String getObj_proc_compra() {
		return obj_proc_compra;
	}

	public void setObj_proc_compra(String obj_proc_compra) {
		this.obj_proc_compra = obj_proc_compra;
	}

	public String getDescricao_controle() {
		return descricao_controle;
	}

	public void setDescricao_controle(String descricao_controle) {
		this.descricao_controle = descricao_controle;
	}

	public String getPais_org_transf() {
		return pais_org_transf;
	}

	public void setPais_org_transf(String pais_org_transf) {
		this.pais_org_transf = pais_org_transf;
	}

	public String getDado_org_transf() {
		return dado_org_transf;
	}

	public void setDado_org_transf(String dado_org_transf) {
		this.dado_org_transf = dado_org_transf;
	}
	
	
	
	
	
}
*/