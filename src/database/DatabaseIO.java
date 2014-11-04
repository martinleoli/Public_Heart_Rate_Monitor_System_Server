package database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * The class contains all operations with xml file
 * 
 * @author Bing Li
 *
 */
public class DatabaseIO {
	private DocumentBuilderFactory builderFactory;
	private DocumentBuilder builder;
	private Document document;
	private FileInputStream file;
	private String filepath;
	private Element rootElement;

	/**
	 * test constructor create test.xml
	 */
	public DatabaseIO() {
		this("test.xml");
	}

	/**
	 * default constructor
	 * 
	 * @param filename
	 *            the xml file path
	 */
	public DatabaseIO(String filename) {
		builderFactory = DocumentBuilderFactory.newInstance();
		builder = null;
		this.filepath = filename;
		file = null;
		document = null;

		this.loadXMLFile(this.filepath);// Load xml file

		this.loadDocument();// Parse xml file

		this.rootElement = this.document.getDocumentElement();

	}

	/**
	 * load XML parser and parse XML file
	 */
	private void loadDocument() {
		try {// load parse
			builder = builderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}

		// parse XML file
		try {
			document = builder.parse(file);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Parse XML File successed!:" + this.filepath);
	}

	/**
	 * Load XML file. if file not existed, then create it.
	 * 
	 * @param path
	 *            a String represent the path of file
	 */
	private void loadXMLFile(String path) {
		try {
			this.file = new FileInputStream(path);
			System.out.println("Load XML File successed!:" + path);
		} catch (FileNotFoundException e) {
			System.out
					.println("Input File not found!\nTrying to create XML file:"
							+ path);
			// e.printStackTrace();
			try {
				FileWriter f = new FileWriter(path);
				f.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<database>\n\t<data>\n\t\t<userID>1000000000</userID>\n\t\t<eventID>1000000000</eventID>\n\t</data>\n</database>\n");
				f.close();
				System.out.println("XML file created!:" + path);

				this.file = new FileInputStream(path);
				System.out.println("Load XML File successed!:" + path);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				// e1.printStackTrace();
				System.out.println("Creating XML file Failed:" + path);
				System.exit(0);
			}
		}
	}

	/**
	 * retrieve the new userID
	 * 
	 * @return a long integer number represent the user ID
	 */
	private long getUserID() {
		NodeList nodes = this.rootElement.getElementsByTagName("data");
		Node node = nodes.item(0);
		nodes = ((Element) node).getElementsByTagName("userID");
		node = nodes.item(0);
		return Long.parseLong(node.getTextContent());
	}
	
	/**
	 * retrieve the new eventID
	 * 
	 * @return a long integer number represent the event ID
	 */
	private long getEventID() {
		NodeList nodes = this.rootElement.getElementsByTagName("data");
		Node node = nodes.item(0);
		nodes = ((Element) node).getElementsByTagName("eventID");
		node = nodes.item(0);
		return Long.parseLong(node.getTextContent());
	}

	public void test() {

		System.out.println(this.getEventID());
		// this.loadXMLFile("test.xml");

		// System.out.println(this.rootElement.getNodeName());
		/*
		 * NodeList nodes = this.rootElement.getElementsByTagName("data"); Node
		 * node = nodes.item(0); nodes =
		 * ((Element)node).getElementsByTagName("userID"); node = nodes.item(0);
		 * System.out.println(node.getTextContent());
		 * 
		 * /* NodeList nodes = this.rootElement.getChildNodes();
		 * 
		 * for(int i=0; i<nodes.getLength(); i++){ Node node = nodes.item(i);
		 * 
		 * if(node instanceof Element){ //a child element to process Element
		 * child = (Element) node; System.out.println(child.getNodeName()); } }
		 * 
		 * System.out.println();
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseIO database = new DatabaseIO("test.xml");
		database.test();
	}

}
