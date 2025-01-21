package ceu.dam.ad.api.ejemplo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ceu.dam.ad.api.ejemplo.model.Coche;
import ceu.dam.ad.api.ejemplo.service.CocheService;
import ceu.dam.ad.api.ejemplo.service.NotFoundException;

@RestController
public class CocheApiService {

	@Autowired
	private CocheService service;

	// este mejor

	@GetMapping("/coches/{id}")
	public Coche consultar(@PathVariable Long id) throws NotFoundException {
		return service.consultarCoche(id);
	}

	/**
	 * @GetMapping("/coches") public Coche consultar(@RequestParam Long id) throws
	 * NotFoundException { return service.consultarCoche(id); }
	 */

	@GetMapping("/coches")
	public List<Coche> buscarMarca(@RequestParam String marca) {
		return service.buscarCoches(marca);
	}

	@PostMapping("/coches")
	public Coche crear(@RequestBody Coche coche) {
		return service.crearCoche(coche);
	}

	@PutMapping("/coches")
	public Coche actualizarCoche(@RequestBody Coche coche) throws NotFoundException {
		return service.actualizarCoche(coche);
	}

	@DeleteMapping("/coches/{id}")
	public void borrar(@PathVariable Long id) throws NotFoundException {
		service.borrarCoche(id);
	}
}
