package ejercicio02.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ceu.dam.ad.ejerciciosTema3.csv.exceptions.CsvException;
import ejercicios.ejercicio05.model.User;
import ejercicios.ejercicio05.service.DuplicateUserException;
import ejercicios.ejercicio05.service.UserException;
import ejercicios.ejercicio05.service.UserServiceImpl;

public class Ejercicio02Service {
	private UserServiceImpl dao;
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	public Ejercicio02Service() {
		dao = new UserServiceImpl();
	}

	public void importarUsuarioCSV(String nombreFichero) throws CsvException {
		log.info(nombreFichero);
		File file = new File(nombreFichero);

		String linea;
		int conMal = 0;
		int conBien = 0;
		try (Scanner scanner = new Scanner(file);) {

			while (scanner.hasNext()) {
				try {

					linea = scanner.nextLine();
					String[] partes = linea.split("\t");
					User u = new User();
					u.setUsername(partes[0]);
					u.setPassword(partes[1]);
					u.setEmail(partes[2]);
					dao.createUser(u);
					conBien++;
				} catch (DuplicateUserException e) {
					log.warn("Error creando usuario", e);
					conMal++;
				} catch (UserException e) {
					log.warn("Error creando usuario", e);
					conMal++;
				}
			}
			scanner.close();
			log.info("El fichero se ha importado con un total de " + conBien + "bien y mal " + conMal);
		} catch (FileNotFoundException e) {
			log.error("Error al encontrar el fichero",e);

		}
	}
}
