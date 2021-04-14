package co.mz.eladio.repository;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;



import co.mz.eladio.model.ClienteRest;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.Reader;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class ClienteRestService {

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	public static void main(String[] args) throws IOException, JSONException {
		
		List<ClienteRest> clienteRests = new ArrayList<ClienteRest>();
		
		//clienteRests = buscaTodos();
		
		for(int i = 0; i < clienteRests.size(); i ++){
			
			System.out.println(clienteRests.get(i).getName());
			
			System.out.println(clienteRests.get(i).getArea());
			
			
		}
	}

	public  List<ClienteRest> buscaTodos() throws JSONException, IOException {

		List<ClienteRest> clienteRests = new ArrayList<ClienteRest>();

		JSONObject json = readJsonFromUrl("https://restcountries.eu/rest/v2/alpha/col");

		for (int i = 0; i < 1; i++) {

			ClienteRest clienteRest = new ClienteRest();
			
			clienteRest.setName(json.getString("name"));
			clienteRest.setCapital(json.getString("capital"));
			clienteRest.setRegion(json.getString("region"));
			clienteRest.setSubregion(json.getString("subregion"));
			clienteRest.setPopulation(json.getInt("population"));
		    clienteRest.setArea(json.getDouble("area"));
		//	clienteRest.setTimezones(json.get("timezones"));
			clienteRest.setNativeName(json.getString("nativeName"));
			clienteRest.setFlag(json.getString("flag"));
			
			clienteRests.add(clienteRest);
			
		}
		
		return clienteRests;

	}

}
