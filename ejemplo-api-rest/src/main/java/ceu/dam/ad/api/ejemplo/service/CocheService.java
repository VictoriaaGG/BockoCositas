package ceu.dam.ad.api.ejemplo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ceu.dam.ad.api.ejemplo.model.Coche;
import ceu.dam.ad.api.ejemplo.repository.CocheRepository;

@Service
public class CocheService {
	@Autowired
	CocheRepository cocheRep;

	public Coche consultarCoche(Long id) throws NotFoundException {
		Optional<Coche> cocheOpt = cocheRep.findById(id);
		if (!cocheOpt.isPresent()) {
			throw new NotFoundException("No existe coche con el id indicado");
		}
		Coche coche = cocheOpt.get();
		return coche;
	}

	public List<Coche> buscarCoches(String filtroMarca) {
		List<Coche> lista = cocheRep.findByMarcaContaining(filtroMarca);
		return lista;
	}
	
	@Transactional
	public Coche crearCoche(Coche coche) {
		return cocheRep.save(coche);

	}
	@Transactional
	public Coche actualizarCoche(Coche coche) throws NotFoundException {
		consultarCoche(coche.getId());
		return cocheRep.save(coche);
	}
	
	@Transactional
	public void borrarCoche(Long id) throws NotFoundException {
		consultarCoche(id);
		cocheRep.deleteById(id);
	}
}
