package ejercicio07.service;

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

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio06.modelo.Largometraje;
import ceu.dam.ad.ejerciciosTema3.xml.ejercicio06.modelo.Persona;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLImportException;
import ejercicios.ejercicio05.service.UserServiceImpl;

public class Ejercicio07ServiceImpl {
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	public List<Largometraje> importarXML(String pathFile) throws XMLImportException {
		log.info(pathFile);
		List<Largometraje> largometrajes = new ArrayList<>();
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			File fichero = new File(pathFile);
			Document xml;

			xml = builder.parse(fichero);

			Element peliculasTag = xml.getDocumentElement();

			NodeList peliculaList = peliculasTag.getElementsByTagName("pelicula");
			for (int i = 0; i < peliculaList.getLength(); i++) {
				List<Persona> actores = new ArrayList<>();
				Element peliculaTag = (Element) peliculaList.item(i);
				Largometraje largometraje = new Largometraje();

				Element tituloTag = (Element) peliculaTag.getElementsByTagName("titulo").item(0);
				largometraje.setTitulo(tituloTag.getTextContent());

				Element duracionTag = (Element) peliculaTag.getElementsByTagName("duracion").item(0);
				largometraje.setDuracion(Integer.parseInt(duracionTag.getTextContent()));

				Element añoTag = (Element) peliculaTag.getElementsByTagName("año").item(0);
				largometraje.setAño(Integer.parseInt(añoTag.getTextContent()));

				Element artistasTag = (Element) peliculaTag.getElementsByTagName("artistas").item(0);
				NodeList artistaList = artistasTag.getElementsByTagName("artista");
				for (int j = 0; j < artistaList.getLength(); j++) {
					Persona artista = new Persona();
					Element artistaTag = (Element) artistaList.item(j);
					String tipo = artistaTag.getAttribute("tipo");

					Element nombreTag = (Element) artistaTag.getElementsByTagName("nombre").item(0);
					artista.setNombre(nombreTag.getTextContent());

					Element nacionalidadTag = (Element) artistaTag.getElementsByTagName("nacionalidad").item(0);
					artista.setNacionalidad(nacionalidadTag.getTextContent());
					if (tipo.equals(Persona.DIRECCION)) {
						largometraje.setDireccion(artista);
					}else if (tipo.equals(Persona.PRODUCCION)) {
						largometraje.setProduccion(artista);
					} else{
						actores.add(artista);
					}
				}
				largometraje.setActores(actores);

				largometrajes.add(largometraje);
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			log.error("Hala caramba que Dios te lo manda", e);
		}
		log.info("Se ha leido perfe");
		return largometrajes;

	}
}
