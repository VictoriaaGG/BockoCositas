package ceu.dam.ad.tema3.ejercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ceu.dam.ad.tema3.ejercicios.ejercicio01.services.PeliculasException;
import ceu.dam.ad.tema3.ejercicios.ejercicio01.services.PeliculasService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		PeliculasService service = context.getBean(PeliculasService.class);
		try {
			System.out.println(service.consultarPeliculas(100));
		} catch (PeliculasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
