package com.usuarioMS.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.usuarioMS.entity.UsuarioInterno;

@Repository
@EnableMongoRepositories
public interface IUsuarioInternoRepository extends MongoRepository<UsuarioInterno, Serializable> {

	  @Query("{ 'Tipo' : ?0 }")
	  List<UsuarioInterno> findByTipo(String Tipo);
	
	  @Query(value="{idUser : $0}", delete = true)
	  public void deleteByCodigo(String id);
}
