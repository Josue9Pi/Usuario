package com.usuarioMS.service;

import org.springframework.http.ResponseEntity;

import com.usuarioMS.model.RequestUsuario;

public interface IUsuarioService {

	 ResponseEntity<Object> consultaUsuario(String Tipo) ;
	 
	 ResponseEntity<Object> ingresaUsuario(RequestUsuario Tipo) ;

	 ResponseEntity<Object> updateUsuario(RequestUsuario peticion);
	 
	 ResponseEntity<Object> deleteUsuario(String id);
}
