package tomtom.cgi.automation;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XmlDataReader {

	public XmlDataReader() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			File fXmlFile = new File("C:/Users/tiwarirt/AppData/Roaming/Skype/My Skype Received Files/mapshop-crt-package_970_Pre-prod.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			//optional, but recommended
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
					
			NodeList nList = doc.getElementsByTagName("product");
					
			System.out.println("----------------------------");
			System.out.print("SELECT * FROM `PRODUCT` WHERE Article_number IN (");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
						
				//System.out.println("\nCurrent Element :" + nNode.getNodeName());
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					//System.out.println("Product Tag : " + eElement.getAttribute("product"));
					if(temp==0)
						System.out.print("'"+eElement.getElementsByTagName("sku").item(0).getTextContent()+"'");
					else 
					    System.out.print(",'"+eElement.getElementsByTagName("sku").item(0).getTextContent()+"'");
					
				}
			}
			System.out.print(")");
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		  }

	}

