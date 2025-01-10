package ceu.dam.ad.ejerciciosTema3.avanzado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ceu.dam.ad.ejerciciosTema3.avanzado.ejercicio1.test.Test1;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		Test1 test2 = context.getBean(Test1.class);
		test2.test();
	}

}
