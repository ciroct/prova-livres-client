package br.unisantos.prova.livres.model;

import java.util.Date;

public class Calendario {
	private Long id;
	private Date dataEntrega;
	
	public Calendario() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
}
