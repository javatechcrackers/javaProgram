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

public class Import_brix extends BaseClass{

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

			Element rootElement = doc.createElement("Monitor");
			doc.appendChild(rootElement);

			Element declares = doc.createElement("declares");
			rootElement.appendChild(declares);

			for (int i = 0; i < list.size(); i++) {
				Element declare = doc.createElement("declare");
				declare.appendChild(doc.createTextNode(list.get(i)));
				declares.appendChild(declare);

				Attr attr = doc.createAttribute("id");
				attr.setValue(base.putunderscore(list.get(i).toLowerCase()));
				declare.setAttributeNode(attr);

				Attr attr2 = doc.createAttribute("type");
				attr2.setValue("headerindex");
				declare.setAttributeNode(attr2);

			}

			Element queries = doc.createElement("queries");
			rootElement.appendChild(queries);

			for (int i = 0; i < list.size(); i++) {
				Element query = doc.createElement("query");
				queries.appendChild(query);

				Element attributes = doc.createElement("attributes");
				query.appendChild(attributes);
				
				for(int k=0;k<1;k++){
					Attr attr = doc.createAttribute("alias");
					attr.setValue(base.putunderscore(list.get(i).toLowerCase()));
					attributes.setAttributeNode(attr);
					
					Attr attr1 = doc.createAttribute("class");
					attr1.setValue("none");
					attributes.setAttributeNode(attr1);
					
				}
				
				Element default_ = doc.createElement("default");
				default_.appendChild(doc.createTextNode(list.get(i)));
				query.appendChild(default_);
				
				for(int k=0;k<1;k++){
					Attr attr = doc.createAttribute("method");
					attr.setValue("import");
					default_.setAttributeNode(attr);
												
				}

			}
			Element expressions = doc.createElement("expressions");
			rootElement.appendChild(expressions);

			for (int i = 0; i < list.size(); i++) {
				Element expression = doc.createElement("expression");
				expression.appendChild(doc.createTextNode(list.get(i)));
				expressions.appendChild(expression);

				Attr attr = doc.createAttribute("object_id");
				attr.setValue(base.putunderscore(list.get(i).toLowerCase()));
				expression.setAttributeNode(attr);

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
