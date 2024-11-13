package ejercicio08;

import java.io.IOException;
import java.util.List;

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio04.modelo.Libro;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLImportException;

public class Test {
	public static void main(String[] args) {
		LibroSaxService service = new LibroSaxService();

		List<Libro> lista;
		try {
			lista = service.importXML("C:/Users/vgordillo7875/Desktop/bockocositas/acceso_datos_xml/Libros.xml");
			lista.forEach(System.out::println);
		} catch (XMLImportException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
