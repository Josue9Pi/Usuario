package com.usuarioMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.usuarioMS.model.RequestUsuario;
import com.usuarioMS.entity.UsuarioExterno;
import com.usuarioMS.entity.UsuarioInterno;
import com.usuarioMS.repository.IUsuarioInternoRepository;
import com.usuarioMS.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

	private String CODIGO_VAR = "idUser";
	
	@Autowired
	IUsuarioRepository userExterno;
	
	@Autowired
	IUsuarioInternoRepository userInterno;	
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public ResponseEntity<Object> consultaUsuario(String Tipo) 
	{
		 ResponseEntity<Object> objResult;
		 
		 try 
		 {
			 if(Tipo.equals("EXTERNO")) 
			 {
				 objResult =  new ResponseEntity<>(userExterno.findByTipo(Tipo),
							HttpStatus.OK);
			 }
			 else 
			 {
				 objResult =  new ResponseEntity<>(userInterno.findByTipo(Tipo),
							HttpStatus.OK);
			 }
		 }
		 catch(Exception ex)
		 {
			 objResult =  new ResponseEntity<>(ex.getMessage(),
						HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 
		 return objResult;

	}
	
	
	public ResponseEntity<Object> ingresaUsuario(RequestUsuario Tipo) 
	{
		ResponseEntity<Object> objResult; 
		try 
		{
			
			if(Tipo.getTipo().equals("EXTERNO") ) 
			{
				UsuarioExterno userExterno = new UsuarioExterno();
				userExterno.setIdUser(Tipo.getCodigoUsuario());
				userExterno.setNombre(Tipo.getTipo());
				userExterno.setTipo(Tipo.getTipo());
				userExterno.setContacto(Tipo.getInline1());
				userExterno.setCorreo(Tipo.getInline2());
				userExterno.setEntidad(Tipo.getInline3());	
				mongoTemplate.save(userExterno);

			}
			else 
			{
				UsuarioInterno userInterno = new UsuarioInterno();
				userInterno.setIdUser(Tipo.getCodigoUsuario());
				userInterno.setNombre(Tipo.getTipo());
				userInterno.setTipo(Tipo.getTipo());
				userInterno.setPerfil(Tipo.getInline1());
				userInterno.setCodEmpleado(Tipo.getInline2());
				userInterno.setPuesto(Tipo.getInline3());
				mongoTemplate.save(userInterno);
			}
			
			objResult =  new ResponseEntity<>(HttpStatus.OK);
		}
			
		 catch(Exception ex)
		 {
			 objResult =  new ResponseEntity<>(ex.getMessage(),
						HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 
		 return objResult;

	}

	public ResponseEntity<Object> updateUsuario(RequestUsuario peticion) 
	{
		 ResponseEntity<Object> objResult;
		 
		 try 
		 {
			 Query query = Query.query(Criteria.where(CODIGO_VAR).is(peticion.getCodigoUsuario())); 			 
			 Update update = new Update();
			 update.set("nombre", peticion.getNombre());
			 update.set("tipo", peticion.getTipo());
			 
			 if(peticion.getTipo().equals("INTERNO")) 
			 {
				update.set("contacto", peticion.getInline1());
				update.set("correo", peticion.getInline2());
				update.set("entidad", peticion.getInline3()); 
			 }
			 else 
			 {
				update.set("codEmpleado", peticion.getInline1());
				update.set("puesto", peticion.getInline2());
				update.set("perfil", peticion.getInline3());				 
			 }
			 
				mongoTemplate.updateFirst(query, update, "USUARIO");			
				objResult =  new ResponseEntity<>(HttpStatus.OK);

		 }
		 catch(Exception ex)
		 {
			 objResult =  new ResponseEntity<>(ex.getMessage(),
						HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 
		 return objResult;

	}

	public ResponseEntity<Object> deleteUsuario(String id) 
	{
		 ResponseEntity<Object> objResult;
		 
		 try 
		 {
			 Query query = Query.query(Criteria.where(CODIGO_VAR).is(id));
			 mongoTemplate.remove(query, "USUARIO" );
			 objResult =  new ResponseEntity<>(HttpStatus.OK);
		 }
		 catch(Exception ex)
		 {
			 objResult =  new ResponseEntity<>(ex.getMessage(),
						HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 
		 return objResult;

	}

}
