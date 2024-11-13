package ejercicio04.test;

import java.util.ArrayList;
import java.util.List;

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio04.modelo.Libro;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLExportException;
import ejercicio04.service.Ejercicio04Service;

public class Test {

	public static void main(String[] args) {
		List<Libro> libros = new ArrayList<>();
		libros = Libro.createRandomList(6);
		Ejercicio04Service service = new Ejercicio04Service();
		try {
			service.exportXML(libros, "c:/Users/vgordillo7875/Desktop/bockocositas/acceso_datos_xml/Libros.xml");
		} catch (XMLExportException e) {

			e.printStackTrace();
		}
	}

}
