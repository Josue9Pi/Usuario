package com.usuarioPY.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.usuarioPY.model.Request;
import com.usuarioPY.model.Usuario;

public class UsuarioPyService implements IUsuarioPyService{

	public ResponseEntity<Object> llamaUser(String tipo) {
		ResponseEntity<Object> response = null;

		RestTemplate restTemplate = new RestTemplate();
		 response = restTemplate.getForEntity("http://localhost:8192/v1/ms/UsuarioMs/EXTERNO", Object.class);
		
		return new ResponseEntity<>(response.getBody(), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Object> consultaUsuario(String tipo) {
		try {
			ResponseEntity<Object> response = null;

			RestTemplate restTemplate = new RestTemplate();
			 response = restTemplate.getForEntity("http://localhost:8192/v1/ms/UsuarioMs", Object.class);
			
			return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
		}
		catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@Override
	public ResponseEntity<Object> ingresaUsuario(Usuario body) {
		try {
			ResponseEntity<Object> response = null;

			Request r = new Request(body.getCodEmpleado(), body.getIDUser(), body.getNombre(), body.getPerfil(), body.getPuesto(), body.getTipo());
			
			RestTemplate restTemplate = new RestTemplate();
			 response = restTemplate.getForEntity("http://localhost:8192/v1/ms/UsuarioMs", Object.class);
			
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
}
