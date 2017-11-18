package XML.SaxParsar;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlParsingUsingSax extends DefaultHandler {

	private String value;

	public static void main(String[] args) {
		System.out.println("Type\tName\tRollNo\tAge\n");
		new XmlParsingUsingSax().parseXmlDocument();
	}

	public void parseXmlDocument() {
		try {
			// getting SAXParserFactory instance
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

			// Getting SAXParser object from AXParserFactory instance
			SAXParser saxParser = saxParserFactory.newSAXParser();

			// Parsing XML Document by calling parse method of SAXParser class
			saxParser.parse("G://New folder//Static_file//Students.xml", this);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Overriding characters() method of DefaultHandler class
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		value = new String(ch, start, length);
	}

	// Overriding startElement() method of DefaultHandler class
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		value = "";
		if (qName.equalsIgnoreCase("Student")) {
			System.out.print(attributes.getValue("type") + "\t");
		}
	}

	// Overriding endElement() method of DefaultHandler class
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.equalsIgnoreCase("Name")) {
			System.out.print(value + "\t");
		}

		if (qName.equalsIgnoreCase("RollNo")) {
			System.out.print(value + "\t");
		}
		if (qName.equalsIgnoreCase("Age")) {
			System.out.print(value + "\n");
		}
	}
}
