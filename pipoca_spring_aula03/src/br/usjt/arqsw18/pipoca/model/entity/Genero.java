package br.usjt.arqsw18.pipoca.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="genero")
public class Genero {
	private int id;
	private String nome;
	
	@OneToMany (mappedBy="genero")
	private List<Filme> filme;
	
	public List<Filme> getFilme() {
		return filme;
	}
	public void setFilme(List<Filme> filme) {
		this.filme = filme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Genero [id=" + id + ", nome=" + nome + "]";
	}
	
}
