package org.ReadCSVFile;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Monitor_Objects_Import_Brix {

static BaseClass base = new BaseClass();
	
	public static void writefile(ArrayList<String> list, String passfileName, String fileFolderPath) {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();

		DocumentBuilder docBuilder = null;
		try {
			docBuilder = docFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		Document doc = docBuilder.newDocument();
		try {

			Element rootElement = doc.createElement("ObjectDefinitions");
			doc.appendChild(rootElement);

			for (int i = 0; i < list.size(); i++) {
				Element object = doc.createElement("object");
				//object.appendChild(doc.createTextNode(list.get(i)));
				rootElement.appendChild(object);

				Attr attr = doc.createAttribute("id");
				attr.setValue(base.putunderscore(list.get(i).toLowerCase()));
				object.setAttributeNode(attr);

				Element descriptions = doc.createElement("descriptions");
				object.appendChild(descriptions);
				
				Element description = doc.createElement("description");
				description.appendChild(doc.createTextNode(list.get(i)));
				descriptions.appendChild(description);
					
				Attr attr1 = doc.createAttribute("lang");
				attr1.setValue("english");
				description.setAttributeNode(attr1);

			}

			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(base.getfileName(fileFolderPath,passfileName)));
			transformer.transform(source, result);
			System.out.println("File saved!");
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

}
