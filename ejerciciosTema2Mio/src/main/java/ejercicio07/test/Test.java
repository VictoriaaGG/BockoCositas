package ejercicio07.test;

import java.util.ArrayList;
import java.util.List;

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio06.modelo.Largometraje;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLImportException;
import ejercicio07.service.Ejercicio07ServiceImpl;

public class Test {

	public static void main(String[] args) {
		Ejercicio07ServiceImpl service = new Ejercicio07ServiceImpl();
		List<Largometraje> largometrajes = new ArrayList<>();
		try {
			largometrajes = service
					.importarXML("c:/Users/vgordillo7875/Desktop/bockocositas/acceso_datos_xml/peliculas.xml");
		} catch (XMLImportException e) {

			e.printStackTrace();
		}
		System.out.println(largometrajes);
	}

}
