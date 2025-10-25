package tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class ReadXml {
	public void readXml() throws ParserConfigurationException, SAXException, IOException {
		File file = new File("C:/Users/Dilip/Desktop/sample.xml");
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(file);
		NodeList lsit = doc.getElementsByTagName("username");
		System.out.println(lsit.item(0).getTextContent());
	}
}
