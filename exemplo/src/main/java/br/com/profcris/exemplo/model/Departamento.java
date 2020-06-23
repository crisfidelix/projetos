package br.com.profcris.exemplo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Departamento é uma entidade
@Table(name="tbl_departamento") // cujo nome da tabela foi definido

public class Departamento {
	
		
	@Id
	@Column(name="id") // id é chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // gerado pelo banco
	
	private int id; // nome da coluna
	
	@Column(name="nome")
	
	private String nome;
	
	
	
	@JsonIgnoreProperties("depto")
		
	//Isso impede, toda vez que o JPA encontrar um produto de buscar a lista de produtos que
	//estão relacionada ao departamento que ele pertence.
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "depto")	
	
	private List<Produto> listaProdutos;

	
	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	int getId() {
		return id;
	}

	
	void setId(int id) {
		this.id = id;
	}

	
	List<Produto> getListaProdutos() {
		return listaProdutos;
	}


	void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
