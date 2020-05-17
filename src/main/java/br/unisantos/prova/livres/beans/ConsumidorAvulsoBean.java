package br.unisantos.prova.livres.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.unisantos.prova.livres.model.ConsumidorAvulso;
import br.unisantos.prova.livres.rest.ConsumidorAvulsoRESTClient;

@ManagedBean
@SessionScoped
public class ConsumidorAvulsoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ConsumidorAvulso consumidor = new ConsumidorAvulso();

	public ConsumidorAvulsoBean() {
	}

	public ConsumidorAvulso getConsumidor() {
		return consumidor;
	}

	public void setConsumidor(ConsumidorAvulso consumidor) {
		this.consumidor = consumidor;
	}
	
	public String gravar() {
		ConsumidorAvulsoRESTClient rest = new ConsumidorAvulsoRESTClient();
		rest.create(consumidor);
		return null;
	}
}
