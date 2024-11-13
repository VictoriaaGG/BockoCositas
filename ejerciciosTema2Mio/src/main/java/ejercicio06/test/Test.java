package ejercicio06.test;

import java.util.ArrayList;
import java.util.List;

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio06.modelo.Largometraje;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLExportException;
import ejercicio06.service.Ejercicio06ServiceImpl;

public class Test {
	public static void main(String[] args) {
		List<Largometraje> lista = new ArrayList<>();

		lista = Largometraje.createRandomList(6);
		Ejercicio06ServiceImpl service = new Ejercicio06ServiceImpl();

		try {
			service.exportarXML(lista, "c:/Users/vgordillo7875/Desktop/bockocositas/acceso_datos_xml/peliculas.xml");
		} catch (XMLExportException e) {

			e.printStackTrace();
		}
	}
}
