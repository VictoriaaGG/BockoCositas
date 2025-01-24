package ceu.dam.ad.api.ej1.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ceu.dam.ad.api.ej1.model.Actor;
import ceu.dam.ad.api.ej1.service.ActorService;
import ceu.dam.ad.api.ej1.service.NotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.PastOrPresent;

@RestController
@RequestMapping("api/actores")
public class ActorApiService {

	@Autowired
	ActorService service;

	@GetMapping("/{id}")
	public Actor consultar(@PathVariable Integer id) throws NotFoundException {
		return service.consultarActor(id);
	}

	@DeleteMapping("/{id}")
	public void borrar(@PathVariable Integer id) throws NotFoundException {
		service.borrarActor(id);
	}

	@PutMapping
	public Actor actualizarCoche(@Valid @RequestBody Actor actor) throws NotFoundException {
		return service.actualizarActor(actor);
	}

	@PostMapping
	public Actor crear(@Valid @RequestBody Actor actor) {
		return service.crearActor(actor);
	}

	@GetMapping("/filtro")
	public List<Actor> buscarPorNombreApellido(@RequestParam(required = false, defaultValue = "") String filtro1) {
		return service.buscarActoresNombreApellido(filtro1);
	}

	@GetMapping("/fechas")
	public List<Actor> buscarPorFecha(
			@RequestParam(required= false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha1,
			@RequestParam(required= false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha2) {
		return service.buscarActoresFecha(fecha1, fecha2);
	}
}
