package com.usuarioFactory.Usuario;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UsuarioExterno extends UsuarioEntidad {

    private String correo;
    private String contacto;
    private String entidad;
    



	public String getCorreo() {
		return correo;
	}




	public void setCorreo(String correo) {
		this.correo = correo;
	}




	public String getContacto() {
		return contacto;
	}




	public void setContacto(String contacto) {
		this.contacto = contacto;
	}




	public String getEntidad() {
		return entidad;
	}




	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}




	public ResponseEntity<Object> llamaUser(String tipo) {
		ResponseEntity<Object> response = null;

		RestTemplate restTemplate = new RestTemplate();
		 response = restTemplate.getForEntity("http://localhost:8192/v1/ms/UsuarioMs/EXTERNO", Object.class);
		
		return new ResponseEntity<>(response.getBody(), HttpStatus.OK);

	}
    
	
}
