package ejercicio06.service;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio06.modelo.Largometraje;
import ceu.dam.ad.ejerciciosTema3.xml.ejercicio06.modelo.Persona;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLExportException;
import ejercicios.ejercicio05.service.UserServiceImpl;

public class Ejercicio06ServiceImpl {
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	public void exportarXML(List<Largometraje> peliculas, String fichero) throws XMLExportException {
		log.info("Se va a generar este fichero " + fichero);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document xml = builder.newDocument();
			Element peliculasTag = xml.createElement("peliculas");
			xml.appendChild(peliculasTag);
			for (Largometraje largometraje : peliculas) {
				log.info(largometraje.toString());

				Element peliculaTag = xml.createElement("pelicula");
				peliculasTag.appendChild(peliculaTag);

				Element tituloTag = xml.createElement("titulo");
				peliculaTag.appendChild(tituloTag);
				tituloTag.setTextContent(largometraje.getTitulo());

				Element duracionTag = xml.createElement("duracion");
				peliculaTag.appendChild(duracionTag);
				duracionTag.setTextContent(largometraje.getDuracion().toString());

				Element añoTag = xml.createElement("año");
				peliculaTag.appendChild(añoTag);
				añoTag.setTextContent(largometraje.getAño().toString());

				Element artistasTag = xml.createElement("artistas");
				peliculaTag.appendChild(artistasTag);

				crearTag(xml, artistasTag, largometraje.getDireccion(), Persona.DIRECCION);

				crearTag(xml, artistasTag, largometraje.getProduccion(), Persona.PRODUCCION);

				List<Persona> actores = largometraje.getActores();
				for (Persona actor : actores) {
					crearTag(xml, artistasTag, actor, Persona.INTERPRETACION);
				}

			}
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			try {
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(xml);
				StreamResult result = new StreamResult(new File(fichero));
				transformer.transform(source, result);
				log.info("EL fichero se ha generado correctamente");
			} catch (Exception e) {
				log.error("Error transformando el fichero", e);
			}

		} catch (ParserConfigurationException e) {
			log.error("Error al ejecutar el método para crear el xml", e);
			e.printStackTrace();
		}
	}

	private void crearTag(Document xml, Element artistasTag, Persona actor, String tipo) {
		Element artistaTag = xml.createElement("artista");
		artistasTag.appendChild(artistaTag);
		artistaTag.setAttribute("tipo", tipo);

		Element nombreActorTag = xml.createElement("nombre");
		artistaTag.appendChild(nombreActorTag);
		nombreActorTag.setTextContent(actor.getNombre());

		Element nacionalidadActorTag = xml.createElement("nacionalidad");
		artistaTag.appendChild(nacionalidadActorTag);
		nacionalidadActorTag.setTextContent(actor.getNacionalidad());
	}
}
