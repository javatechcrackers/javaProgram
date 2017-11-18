package XML.SaxParsar;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import java.io.*;

public class EmployeeDetails{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter XML file name:");
		String xmlFile = bf.readLine();
		EmployeeDetails detail = new EmployeeDetails(xmlFile);
	}
	public EmployeeDetails(String str){
		try{
			File file = new File("src/XML/SaxParsar/" + str + ".xml");
			if (file.exists()){
				SAXParserFactory parserFact = SAXParserFactory.newInstance();
				SAXParser parser = parserFact.newSAXParser();
				System.out.println("XML Data: ");
				DefaultHandler dHandler = new DefaultHandler(){
					
					boolean id;
					boolean name;
					boolean mail;
					
					public void startElement(String uri, String localName, String element_name, Attributes attributes)throws SAXException{
						if (element_name.equals("Emp_Id")){
							id = true;
						}
						if (element_name.equals("Emp_Name")){
							name = true;
						}
						if (element_name.equals("Emp_E-mail")){
							mail = true;
						}
					}
					
					public void characters(char[] ch, int start, int len) throws SAXException{
						String str = new String (ch, start, len);
						if (id){
							System.out.println("Emp_Id: "+str);
							id = false;
						}
						if (name){
							System.out.println("Name:   "+str);
							name = false;
						}
						if (mail){
							System.out.println("E-mail: "+str);
							mail = false;
						}
					}
				};
				
				parser.parse(str, dHandler);
			}
			else{
				System.out.println("File not found!");
			}
		}
		catch (Exception e){
			System.out.println("XML File hasn't any elements");
			e.printStackTrace();
		}
	}
}