package com.usuarioFactory.Usuario;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UsuarioInterno extends UsuarioEntidad {

	private String codEmpleado;
    private String puesto;
    private String perfil;
    

	
    
	public String getCodEmpleado() {
		return codEmpleado;
	}




	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}




	public String getPuesto() {
		return puesto;
	}




	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}




	public String getPerfil() {
		return perfil;
	}




	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	
	public ResponseEntity<Object>  llamaUser(String tipo) {
		ResponseEntity<Object> response;

		RestTemplate restTemplate = new RestTemplate();
		response = restTemplate.getForEntity("http://localhost:8192/v1/ms/UsuarioMs/INTERNO", Object.class);
		
		return new ResponseEntity<>(response.getBody(), HttpStatus.OK);

	}

	
}
