package br.unisantos.prova.livres.model;

public class ConsumidorAvulso {
	private Long id;
	private String nome;
	private String telefone;
	
	public ConsumidorAvulso() {
	}

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
