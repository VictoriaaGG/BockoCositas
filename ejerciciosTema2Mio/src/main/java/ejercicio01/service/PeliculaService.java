package ejercicio01.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ceu.dam.ad.ejerciciosTema2.csv.exceptions.CsvException;
import ejercicios.ejercicio01.modelo.Pelicula;
import ejercicios.ejercicio01.services.PeliculasException;
import ejercicios.ejercicio01.services.PeliculasService;

public class PeliculaService {
	private PeliculasService daoPeli;
	private static final Logger log = LoggerFactory.getLogger(PeliculasService.class);

	public PeliculaService() {
		daoPeli = new PeliculasService();
	}

	public void exportarPeliculasCsv(String nombreFichero) throws CsvException, PeliculasException {
		List<Pelicula> lista = new ArrayList<>();
		try {
			log.info(nombreFichero);
			File file = new File(
					"c:/Users/vgordillo7875/Desktop/bockocositas/acceso_datos_csv/ejercicio1/" + nombreFichero);
			FileWriter writer = new FileWriter(file);
			lista = daoPeli.consultarPeliculas();
			for (int i = 0; i < lista.size(); i++) {
				log.debug(lista.get(i) + "\n");
				writer.write(lista.get(i).getId()+ "\t" + lista.get(i).getNombre()+ "\t" + lista.get(i).getLongitud()+ "\n");
			}

			log.info("Se ha generado el fichero con un total de " + lista.size());
			writer.close();
		} catch (IOException e) {
			log.error("Error en no sé", e);
			System.out.println("No sé el qué pero algo ha salido mal");
			e.printStackTrace();
		}

	}
}
