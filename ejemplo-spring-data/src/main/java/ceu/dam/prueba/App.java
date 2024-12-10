package ceu.dam.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ceu.dam.prueba.model.Actor;
import ceu.dam.prueba.service.ActorNotFoundException;
import ceu.dam.prueba.service.ActorService;
import ceu.dam.prueba.service.ActorServiceException;

@SpringBootApplication
public class App {

	public static void main(String[] args) throws ActorNotFoundException {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

		ActorService service = context.getBean(ActorService.class);

		System.out.println(service.consultarActor(8L));

		Actor a = new Actor();
		a.setFirstName("Blas");
		a.setLastName("de los Montes");
		try {
			service.crearActor(a);
		} catch (ActorServiceException e) {

			System.out.println("Error insertando actor");
		}
		System.out.println(a);
		
		Actor a1 = service.consultarActor(190L);
		a1.setLastName("Blas");
		service.actualizarActor(a1);
		
		service.borrarActor(201L);
		

	}

}
