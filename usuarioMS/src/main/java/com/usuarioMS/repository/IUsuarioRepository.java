package com.usuarioMS.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.usuarioMS.entity.UsuarioExterno;

@Repository
@EnableMongoRepositories
public interface IUsuarioRepository extends MongoRepository<UsuarioExterno, Serializable> {

	  @Query("{ 'Tipo' : ?0 }")
	  List<UsuarioExterno> findByTipo(String Tipo);
	
}
