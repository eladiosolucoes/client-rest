package co.mz.eladio.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.mz.eladio.model.ClienteRest;
import co.mz.eladio.repository.ClienteRestService;




@Path("/cliente-eladio")
public class ClientRestEladio {
	
	


	private static final String CHARSET_UTF8 = ";charset=utf-8";

	private ClienteRestService clienteRestService;

	@PostConstruct
	private void init() {
		this.clienteRestService = new ClienteRestService();
	}

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON + CHARSET_UTF8)
	public List<ClienteRest> list() {
		List<ClienteRest> lista = null;
		try {
			lista = clienteRestService.buscaTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
