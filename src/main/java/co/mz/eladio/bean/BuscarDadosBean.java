package co.mz.eladio.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.json.JSONException;

import co.mz.eladio.model.ClienteRest;
import co.mz.eladio.repository.ClienteRestService;

@ManagedBean
@ViewScoped
public class BuscarDadosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	ClienteRestService clienteRestService = new ClienteRestService();

	List<ClienteRest> clienteRest = new ArrayList<ClienteRest>();

	public void inicialiazr() throws JSONException, IOException {

		this.clienteRest = clienteRestService.buscaTodos();
	}

	public List<ClienteRest> getClienteRest() {
		return clienteRest;
	}

}
