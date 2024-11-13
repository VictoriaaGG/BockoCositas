package ejercicio01.test;

import ceu.dam.ad.ejerciciosTema3.csv.exceptions.CsvException;
import ejercicio01.service.PeliculaService;
import ejercicios.ejercicio01.services.PeliculasException;

public class Test {
	public static void main(String[] args) {
		PeliculaService service = new PeliculaService();
		try {
			service.exportarPeliculasCsv("peliculaPruebaCsv");
		} catch (CsvException e) {
			e.printStackTrace();
		} catch (PeliculasException e) {

			e.printStackTrace();
		}
	}
}
