package com.usuarioPY.controller.ifc;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.usuarioPY.model.Usuario;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface IUsuarioPyController {

	
	@GetMapping(value = "/{tipo}")
	@ApiOperation("Consulta de Usuario")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
			@ApiResponse(code = 204, message = "No Content", response = Error.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 401, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public ResponseEntity<Object> consultaUsuario(
			@ApiParam(value = "", required = true) @PathVariable(value = "tipo", required = true) String tipo);

	@PostMapping(value = "")
	@ApiOperation("Grabado de Usuario")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
			@ApiResponse(code = 204, message = "No Content", response = Error.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 401, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public ResponseEntity<Object> ingresaUsuario(
			@PathVariable(value = "", required = true)  @Valid @RequestBody(required = true) Usuario body);

	
}

