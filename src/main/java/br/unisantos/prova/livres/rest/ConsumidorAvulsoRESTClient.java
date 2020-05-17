package br.unisantos.prova.livres.rest;

import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.unisantos.prova.livres.model.ConsumidorAvulso;

public class ConsumidorAvulsoRESTClient implements RESTClientInterface<ConsumidorAvulso> {
	private Response response;

	@Override
	public List<ConsumidorAvulso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsumidorAvulso find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConsumidorAvulso create(ConsumidorAvulso obj) {
	    this.response = ClientBuilder.newClient().
	    		target(REST_WEBSERVICE_URL + REST_CONSUMIDOR_AVULSO_URL).
	    		queryParam("consumidor", obj).
	    		request(MediaType.APPLICATION_JSON).
	    		post(Entity.entity(obj, MediaType.APPLICATION_JSON));
	    ConsumidorAvulso _consumidor = this.response.readEntity(ConsumidorAvulso.class);

		return _consumidor;
	}

	@Override
	public ConsumidorAvulso edit(ConsumidorAvulso obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
