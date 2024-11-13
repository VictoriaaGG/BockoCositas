package ejercicio08;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio04.modelo.Libro;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLImportException;

public class LibroSaxService {
	public List<Libro> importXML(String pathFile) throws XMLImportException, IOException {

		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();

			Handler handler = new Handler();
			File file = new File(pathFile);

			parser.parse(file, handler);

			return handler.getLibros();
		} catch (Exception e) {
			throw new XMLImportException("Error leyendo xml", e);
		}

	}
}
