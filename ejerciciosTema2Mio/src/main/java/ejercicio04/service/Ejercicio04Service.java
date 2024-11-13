package ejercicio04.service;

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

import ceu.dam.ad.ejerciciosTema3.xml.ejercicio04.modelo.Edicion;
import ceu.dam.ad.ejerciciosTema3.xml.ejercicio04.modelo.Libro;
import ceu.dam.ad.ejerciciosTema3.xml.exceptions.XMLExportException;
import ejercicios.ejercicio05.service.UserServiceImpl;

public class Ejercicio04Service {
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	public void exportXML(List<Libro> libros, String pathFile) throws XMLExportException {
		log.info("Se va a generar etse fichero" + pathFile);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document xml = builder.newDocument();
			Element librosTag = xml.createElement("Libros");
			xml.appendChild(librosTag);

			for (Libro libro : libros) {
				log.debug(libro.toString());

				Element libroTag = xml.createElement("Libro");
				librosTag.appendChild(libroTag);
				libroTag.setAttribute("isbn", libro.getIsbn() + "");

				Element tituloTag = xml.createElement("titulo");
				libroTag.appendChild(tituloTag);
				tituloTag.setTextContent(libro.getTitulo());

				Element autoresTag = xml.createElement("autores");
				libroTag.appendChild(autoresTag);

				for (String autor : libro.getAutores()) {
					Element autorTag = xml.createElement("autor");
					autoresTag.appendChild(autorTag);
					autorTag.setTextContent(autor);
				}

				Element edicionesTag = xml.createElement("ediciones");
				libroTag.appendChild(edicionesTag);

				Element edicionTag = xml.createElement("edicion");
				edicionesTag.appendChild(edicionTag);

				for (Edicion edicion : libro.getEdiciones()) {
					Element añoTag = xml.createElement("año");
					edicionTag.appendChild(añoTag);

					Element editorialTag = xml.createElement("editorial");
					edicionTag.appendChild(editorialTag);

					añoTag.setTextContent(edicion.getAño() + "");
					editorialTag.setTextContent(edicion.getEditorial());

				}

			}
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			try {
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(xml);
				StreamResult result = new StreamResult(new File(pathFile));
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
}
