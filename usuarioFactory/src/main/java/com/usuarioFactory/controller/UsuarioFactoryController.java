package com.usuarioFactory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarioFactory.Usuario.UsuarioExterno;
import com.usuarioFactory.Usuario.UsuarioInterno;


import io.swagger.annotations.Api;

@RequestMapping("/v1/ms/UsuarioFactory")
@RestController
@Api(tags = "UsuarioFactoryV1", description = "Primera version de la API UsuarioFactoryV1")
public class UsuarioFactoryController implements IUsuarioFactory {

	@Override
	public ResponseEntity<Object> ObtieneUsuario(String tipo) {
		
		if(tipo.equals("EXTERNO")) 
		{
			 return new ResponseEntity<>( new UsuarioExterno().llamaUser(tipo),
						HttpStatus.OK);		
		}
		else 
		{
			return new ResponseEntity<>( new UsuarioInterno().llamaUser(tipo),
					HttpStatus.OK);	
		}

	}




}
