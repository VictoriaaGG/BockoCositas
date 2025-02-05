package ceu.dam.ad.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ceu.dam.ad.mongo.model.Descansito;

@Repository
public interface DescansosRepository extends MongoRepository<Descansito, String>,CustomDescansosRepository {
	
	public List<Descansito> findByProfesor(String profesor);
	
}
