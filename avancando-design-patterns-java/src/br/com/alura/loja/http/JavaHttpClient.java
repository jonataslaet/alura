package br.com.alura.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		try {
			System.out.println("Using JavaHttpClient...");
			URL apiUrl = new URL(url);
			URLConnection openConnection = apiUrl.openConnection();
			openConnection.connect();
		} catch (Exception e) {
			throw new RuntimeException("Erro de conexão: ", e);
		}
	}

}
