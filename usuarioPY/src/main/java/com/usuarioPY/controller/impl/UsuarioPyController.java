package com.usuarioPY.controller.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarioPY.controller.ifc.IUsuarioPyController;
import com.usuarioPY.model.Usuario;
import com.usuarioPY.service.IUsuarioPyService;

import io.swagger.annotations.Api;

@RequestMapping("/v1/ms/UsuarioPy")
@RestController
@Api(tags = "UsuarioV1", description = "Primera version de la API UsuarioPyV1")
public class UsuarioPyController implements IUsuarioPyController {

	@Autowired
	IUsuarioPyService service;
	

	@Override
	public ResponseEntity<Object> consultaUsuario(String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Object> ingresaUsuario(@Valid Usuario body) {
		// TODO Auto-generated method stub
		return null;
	}


}
