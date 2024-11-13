package ejercicio05.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio04.modelo.Libro;
import ceu.dam.ad.ejerciciosTema3.xml.ejercicio06.modelo.Largometraje;
import ceu.dam.ad.ejerciciosTema3.xml.ejercicio06.modelo.Persona;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLImportException;
import ejercicios.ejercicio05.service.UserServiceImpl;

/**public class Ejercicio05ServiceImpl {
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	/**public List<Libro> importXML(String pathFile) throws XMLImportException{
		log.info(pathFile);
		List<Libro> libros = new ArrayList<>();
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			File fichero = new File(pathFile);
			Document xml;

			xml = builder.parse(fichero);

			Element librosTag = xml.getDocumentElement();

			NodeList libroList = librosTag.getElementsByTagName("pelicula");
			for (int i = 0; i < libroList.getLength(); i++) {
				List<Persona> actores = new ArrayList<>();
				List<String> autores = new ArrayList<>();
				Element libroTag = (Element) libroList.item(i);
				Libro libro = new Libro();
				Integer isbn = Integer.parseInt(libroTag.getAttribute("isbn"));
				libro.setIsbn(isbn);

				Element tituloTag = (Element) libroTag.getElementsByTagName("titulo").item(0);
				libro.setTitulo(tituloTag.getTextContent());

				Element duracionTag = (Element) libroTag.getElementsByTagName("duracion").item(0);
				
				Element autoresTag = (Element) libroTag.getElementsByTagName("autores").item(0);
				NodeList autorList = autoresTag.getElementsByTagName("autor");
				for (int j = 0; j < autorList.getLength() ; j++) {
					Element autorTag = (Element) autorList.item(j);
					String autor = autorTag.getTextContent();
					autores.add(autor);
				}

				Element artistasTag = (Element) libroTag.getElementsByTagName("artistas").item(0);
				NodeList artistaList = artistasTag.getElementsByTagName("artista");
				for (int j = 0; j < artistaList.getLength(); j++) {
					Element artistaTag = (Element) artistaList.item(i);
					Persona artista = new Persona();
					String tipo = artistasTag.getAttribute("tipo");

					Element nombreTag = (Element) artistaTag.getElementsByTagName("nombre");
					artista.setNombre(nombreTag.getTextContent());

					Element nacionalidadTag = (Element) artistaTag.getElementsByTagName("nacionalidad");
					artista.setNacionalidad(nacionalidadTag.getTextContent());
					if (tipo.equals(Persona.DIRECCION)) {
						//libro.setDireccion(artista);
					} else if (tipo.equals(Persona.PRODUCCION)) {
						//libro.setProduccion(artista);
					} else {
						actores.add(artista);
					}
				}
				//libro.setActores(actores);

				//largometrajes.add(libro);
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			log.error("Hala caramba que Dios te lo manda", e);
		}
		log.info("Se ha leido perfe");
		//return largometrajes;

	}
}
*/