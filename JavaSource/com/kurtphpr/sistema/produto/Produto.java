package com.kurtphpr.sistema.produto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {

	@Id
	@GeneratedValue
	private Integer id;
	private String unidade;
	private String descricao;
	@Column(name="datacadastro")
	private Date dataCadastro;
	private Integer estoque;
	private float valor;
	
	//Construtor Produto sem argumentos, é necessário quando há um construtor com argumentos conforme o contrutor abaixo;
	public Produto(){
		
	}
	
	//Construtor Produto com argumentos, que irá criar os produtos;
	public Produto(String descricao, String unidade, Date dataCadastro, Integer estoque, float valor) {
		
		this.descricao = descricao;
		this.unidade = unidade;
		this.dataCadastro = dataCadastro;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}	
}