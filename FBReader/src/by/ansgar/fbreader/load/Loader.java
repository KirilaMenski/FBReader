package by.ansgar.fbreader.load;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Loader {
	static Document document;

	public static Document loadFile(String path) {
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			document = builder.parse(new File(path));
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

		return document;
	}
	
}
