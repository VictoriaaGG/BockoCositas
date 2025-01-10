package ceu.dam.ad.ejerciciosTema3.avanzado.ejercicio1.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import ceu.dam.ad.ejerciciosTema3.avanzado.ejercicio1.model.Serie;
import ceu.dam.ad.ejerciciosTema3.avanzado.ejercicio1.repository.SerieRepository;

@Service
public class SeriesServiceImpl implements SeriesService {
	private static final Logger log = LoggerFactory.getLogger(SeriesService.class);

	@Autowired
	private SerieRepository serieRep;

	@Override
	public Serie consultarSerie(Long idSerie) throws SerieNotFoundException, SeriesServiceException {
		log.debug("Consultando la serie con id: " + idSerie);
		try {
			Optional<Serie> serieOpt = serieRep.findById(idSerie);
			if (!serieOpt.isPresent()) {
				log.warn("No se ha encontrado la serie con id" + idSerie);
				throw new SerieNotFoundException();
			}
			Serie serie = serieOpt.get();
			return serie;
		} catch (DataAccessException e) {
			log.error("Error buscando la serie", e);
			throw new SeriesServiceException("Error al registrar serie", e);
		}
	}

	@Override
	public List<Serie> buscarSeries(String filtroDescripcion) throws SerieNotFoundException, SeriesServiceException {
		log.debug("Consultando las series con descripcion:" + filtroDescripcion);
		try {
			List<Serie> series = serieRep.findByDescripcionContaining(filtroDescripcion);
			if (series.isEmpty()) {
				throw new SerieNotFoundException("No hay ninguna serie con ese filtro");
			}
			return series;
		} catch (DataAccessException e) {
			log.error("Error buscando las series", e);
			throw new SeriesServiceException("Error al registrar serie", e);
		}
	}

	@Override
	public Serie crearSerie(Serie serie) throws SeriesServiceException {
		log.debug("Creando nueva serie...");
		try {
			log.debug("Insertando datos generales de la serie...");
			Serie serieCreada = serieRep.save(serie);
			return serieCreada;
		} catch (DataAccessException e) {
			log.error("Error creando la serie", e);
			throw new ServiceException("Error al registrar la pelicula", e);
		}

	}

	@Override
	public void elimnarSerie(Long idSerie) throws SeriesServiceException {
		log.debug("Borrando serie con id " + idSerie);
		try {
			serieRep.deleteById(idSerie);
		} catch (DataAccessException e) {
			log.error("Error borrando la serie", e);
			throw new ServiceException("Error al borrar la serie", e);
		}

	}

	@Override
	public void actualizarSerie(Serie serie) throws SeriesServiceException {
		log.debug("Actualizando la serie...");
		try {
			serieRep.save(serie);

		} catch (DataAccessException e) {

			log.error("Error al actualizar la base de datos", e);
			throw new ServiceException("Error al actualizar la base de datos", e);
		}
	}

}
