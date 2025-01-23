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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ceu.dam.ad.api.ej1.model.Actor;
import ceu.dam.ad.api.ej1.service.ActorService;
import ceu.dam.ad.api.ej1.service.NotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.PastOrPresent;

@RestController
public class ActorApiService {

	@Autowired
	ActorService service;

	@GetMapping("/actores/{id}")
	public Actor consultar(@PathVariable Integer id) throws NotFoundException {
		return service.consultarActor(id);
	}

	@DeleteMapping("/actores/{id}")
	public void borrar(@PathVariable Integer id) throws NotFoundException {
		service.borrarActor(id);
	}

	@PutMapping("/actores")
	public Actor actualizarCoche(@Valid @RequestBody Actor actor) throws NotFoundException {
		return service.actualizarActor(actor);
	}

	@PostMapping("/actores")
	public Actor crear(@Valid @RequestBody Actor actor) {
		return service.crearActor(actor);
	}

	@GetMapping("/actoresFiltro")
	public List<Actor> buscarPorNombreApellido(@RequestParam String filtro1) {
		return service.buscarActoresNombreApellido(filtro1, filtro1);
	}

	@GetMapping("/actoresFecha")
	public List<Actor> buscarPorFecha(@PastOrPresent (message = "La fecha debe estar en el pasado o presente") @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha1,
			@PastOrPresent(message = "La fecha debe ser mayor a la otra o presente")@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha2) {
		return service.buscarActoresFecha(fecha1, fecha2);
	}
}
