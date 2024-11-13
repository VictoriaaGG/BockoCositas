package ejercicio02.test;

import ceu.dam.ad.ejerciciosTema3.csv.exceptions.CsvException;
import ejercicio02.service.Ejercicio02Service;

public class Test2 {
	public static void main(String[] args) {
		Ejercicio02Service serv = new Ejercicio02Service();
		try {
			serv.importarUsuarioCSV("users_data.csv");
		} catch (CsvException e) {

			e.printStackTrace();
		}
	}

}
