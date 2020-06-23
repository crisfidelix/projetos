package br.com.profcris.exemplo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_produto")

public class Produto {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome",length=100)
	private String nome;
	
	@Column(name="preco")
	private float preco;
	
	
	@JsonIgnoreProperties("listaProdutos")
	
	@ManyToOne
	private Departamento depto;


	int getId() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}

	
	String getNome() {
		return nome;
	}


	void setNome(String nome) {
		this.nome = nome;
	}


	float getPreco() {
		return preco;
	}

	
   void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	

}
