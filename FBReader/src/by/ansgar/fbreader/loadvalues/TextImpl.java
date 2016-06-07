package by.ansgar.fbreader.loadvalues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.ansgar.fbreader.load.Loader;

public class TextImpl implements Text {

	private String path;

	public TextImpl(String path) {
		this.path = path;
	}

	@Override
	public List<String> getText() {
		NodeList nodeList = Loader.loadFile(path)
				.getElementsByTagName("section");
		List<String> text = new ArrayList<String>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			NodeList nl = Loader.loadFile(path).getElementsByTagName("p");
			for (int j = 0; j < nl.getLength(); j++) {
				try {
					text.add(element.getElementsByTagName("p").item(j)
							.getTextContent() + " ");
				} catch (Exception e) {
					continue;
				}
				text.add("\n");
			}
		}
		return text;
	}

}
