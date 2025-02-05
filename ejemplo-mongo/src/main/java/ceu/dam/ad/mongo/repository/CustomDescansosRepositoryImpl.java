package ceu.dam.ad.mongo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import ceu.dam.ad.mongo.model.Descansito;

public class CustomDescansosRepositoryImpl implements CustomDescansosRepository{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<Descansito> buscarPorNumAlumnos(Integer minNumAlumnos) {
		Query query = new Query();
		//gte -> mayor o igual lte -> menor o igual
		//se añaden en and
		//query.addCriteria(Criteria.where("alumnos").gte(minNumAlumnos));
		//solución alternativa:
		query.addCriteria(Criteria.where("alumnos").not().size(minNumAlumnos - 1));
		//query.addCriteria(Criteria.where("autorizado").is(true));
		
		/** pa hacer un or
		query.addCriteria(new Criteria().orOperator(
				Criteria.where("alumnos").gte(minNumAlumnos),
				Criteria.where("autorizado").is(true)
				));
				**/
		
		//findOne pa uno
		return mongoTemplate.find(query, Descansito.class);
	}
	

}
