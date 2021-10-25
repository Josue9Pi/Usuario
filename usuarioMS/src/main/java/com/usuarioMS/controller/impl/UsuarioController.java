package com.usuarioMS.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarioMS.controller.ifc.IUsuarioController;
import com.usuarioMS.model.RequestCodigoUsuario;
import com.usuarioMS.model.RequestUsuario;
import com.usuarioMS.service.IUsuarioService;


import io.swagger.annotations.Api;

@RequestMapping("/v1/ms/UsuarioMs")
@RestController
@Api(tags = "UsuarioMsV1", description = "Primera version de la API UsuarioMsV1")
public class UsuarioController implements IUsuarioController {

	@Autowired
	IUsuarioService service;


	@Override
	public ResponseEntity<Object> consultaUsuarioxTipo(String tipo) {		

		return service.consultaUsuario(tipo);
	}

	@Override
	public ResponseEntity<Object> ingresaUsuario(RequestUsuario peticion) {
		return service.ingresaUsuario(peticion);

	}

	@Override
	public ResponseEntity<Object> modificaUsuario(RequestUsuario peticion) {
		return service.updateUsuario(peticion);

	}

	@Override
	public ResponseEntity<Object> eliminaUsuario(RequestCodigoUsuario id) {
		return service.deleteUsuario(id.getCodigoUsuario());
	}


}
