package ceu.dam.ad.api.ejemplo;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import ceu.dam.ad.api.ejemplo.model.Coche;
import ceu.dam.ad.api.ejemplo.model.Conductor;
import ceu.dam.ad.api.ejemplo.service.CocheService;

@SpringBootTest
@ActiveProfiles("test")
class AppTests {

	@Autowired
	private CocheService service;

	@Test
	void testCrearCoche() {
		Coche coche = new Coche();
		coche.setMarca("CITROEN");
		coche.setModelo("BERLINGO");
		coche.setConductores(new ArrayList<>());
		coche.getConductores().add(new Conductor());
		coche.getConductores().getLast().setNombre("Blas 1");
		coche.getConductores().getLast().setEdad(18);
		coche.getConductores().add(new Conductor());
		coche.getConductores().getLast().setNombre("Blas 2");
		coche.getConductores().getLast().setEdad(23);

		Coche cocheCreado = service.crearCoche(coche);
		assertNotNull(cocheCreado);
		assertEquals(1L, coche.getId());
		
	}

}
