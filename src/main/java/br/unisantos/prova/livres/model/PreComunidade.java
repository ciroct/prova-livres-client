package br.unisantos.prova.livres.model;

import java.util.List;

public class PreComunidade {
	private Long id;
	private String nome;
	private List<ConsumidorAvulso> consumidores;
	private List<Calendario> calendarioEntrega;

	public PreComunidade() {
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

	public List<ConsumidorAvulso> getConsumidores() {
		return consumidores;
	}

	public void setConsumidores(List<ConsumidorAvulso> consumidores) {
		this.consumidores = consumidores;
	}

	public List<Calendario> getCalendarioEntrega() {
		return calendarioEntrega;
	}

	public void setCalendarioEntrega(List<Calendario> calendarioEntrega) {
		this.calendarioEntrega = calendarioEntrega;
	}
	
}
