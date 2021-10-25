package com.usuarioMS.controller.ifc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.usuarioMS.model.RequestCodigoUsuario;
import com.usuarioMS.model.RequestUsuario;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface IUsuarioController {

	
	@GetMapping(value = "/{tipo}")
	@ApiOperation("Consulta de Usuario.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
			@ApiResponse(code = 204, message = "No Content", response = Error.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 401, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public ResponseEntity<Object> consultaUsuarioxTipo(
			@ApiParam(value = "") @PathVariable(value = "tipo") String tipo
			)	
	;

	@PostMapping(value = "")
	@ApiOperation("Ingreso de Usuario.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
			@ApiResponse(code = 204, message = "No Content", response = Error.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 401, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public ResponseEntity<Object> ingresaUsuario(@RequestBody RequestUsuario peticion);

	@PutMapping(value = "")
	@ApiOperation("Actualiza Usuario.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
			@ApiResponse(code = 204, message = "No Content", response = Error.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 401, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public ResponseEntity<Object> modificaUsuario(@RequestBody RequestUsuario peticion);

	@DeleteMapping(value = "")
	@ApiOperation("Elimina Usuario.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
			@ApiResponse(code = 204, message = "No Content", response = Error.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Error.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 401, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found", response = Error.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
	public ResponseEntity<Object> eliminaUsuario(@RequestBody RequestCodigoUsuario id);

	
}

