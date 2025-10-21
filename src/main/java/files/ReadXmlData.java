package files;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXmlData {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File("C:/Users/Dilip/Desktop/sample.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(file);
			
		NodeList usernames = document.getElementsByTagName("username");
		NodeList passwords = document.getElementsByTagName("password");
		
		NodeList elements = document.getChildNodes();
		
		for (int i = 0; i < usernames.getLength(); i++) {
			Node nod =  usernames.item(i);
			Element ele = (Element) nod;
			System.out.println(ele.getAttribute("id"));
			System.out.println(usernames.item(i).getTextContent());
			System.out.println(passwords.item(i).getTextContent());
		}
	}
}
