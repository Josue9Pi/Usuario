package com.usuarioFactory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


public interface IUsuarioFactory {


	@GetMapping(value = "/{tipo}")
	@ApiOperation("Consulta de Usuarios Segun Tipo")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
			@ApiResponse(code = 204, message = "No Content", response = Error.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 401, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public ResponseEntity<Object> ObtieneUsuario(
			@ApiParam(value = "", required = true) @PathVariable(value = "tipo", required = true) String tipo);

}
