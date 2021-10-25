package com.usuarioPY.service;

import org.springframework.http.ResponseEntity;

import com.usuarioPY.model.Usuario;


public interface IUsuarioPyService {
	
	ResponseEntity<Object> consultaUsuario(String tipo);
	
	ResponseEntity<Object> ingresaUsuario(Usuario body);
	
}