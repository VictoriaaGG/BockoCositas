package ceu.dam.ad.mongo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ceu.dam.ad.mongo.model.Alumno;
import ceu.dam.ad.mongo.model.Descansito;
import ceu.dam.ad.mongo.service.DescansosService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(App.class, args);
		DescansosService service = context.getBean(DescansosService.class);
		
		Descansito d = new Descansito();
		d.setProfesor("abel");
		d.setDuracion(20);
		d.setAutorizado(false);
		d.setAlumnos(new ArrayList<>());
		d.getAlumnos().add(new Alumno("Blas de los montes",22 , true));
		d.getAlumnos().add(new Alumno("Laura",23 , true));
		System.out.println(service.crearDescanso(d));
		
		service.buscarPorNumAlumnos(2).forEach(System.out::println);
	}

}
