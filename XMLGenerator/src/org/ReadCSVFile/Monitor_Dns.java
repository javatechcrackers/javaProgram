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

public class Monitor_Dns {

	static BaseClass base = new BaseClass();

	@SuppressWarnings("static-access")
	public static void writefile(ArrayList<String> list, String passfileName,
			String fileFolderPath) {

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

			Element MonitorTypes = doc.createElement("MonitorTypes");
			doc.appendChild(MonitorTypes);

			Element monitor_type = doc.createElement("monitor_type");
			MonitorTypes.appendChild(monitor_type);

			Element objects = doc.createElement("objects");
			monitor_type.appendChild(objects);

			for (int i = 0; i < list.size(); i++) {
				Element object = doc.createElement("object");
				// object.appendChild(doc.createTextNode(list.get(i)));
				objects.appendChild(object);

				Attr attr = doc.createAttribute("id");
				attr.setValue(base.putunderscore(list.get(i).toLowerCase()));
				object.setAttributeNode(attr);

				Attr attr1 = doc.createAttribute("storage_id");
				attr1.setValue("c" + i);
				object.setAttributeNode(attr1);

				Attr attr2 = doc.createAttribute("storage_transform");
				attr2.setValue("raw");
				object.setAttributeNode(attr2);

				Attr attr3 = doc.createAttribute("storage_type");
				attr3.setValue("integer");
				object.setAttributeNode(attr3);

				Attr attr5 = doc.createAttribute("description");
				attr5.setValue(list.get(i));
				object.setAttributeNode(attr5);
				
				Attr attr4 = doc.createAttribute("units");
				attr4.setValue("count_gauge");
				object.setAttributeNode(attr4);

			
			}

			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(base.getfileName(
					fileFolderPath, passfileName)));
			transformer.transform(source, result);
			System.out.println("File saved!");
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

}
