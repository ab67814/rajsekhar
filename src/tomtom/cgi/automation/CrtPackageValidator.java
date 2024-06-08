package tomtom.cgi.automation;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CrtPackageValidator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				CrtPackageValidatorImpl crtPackageValidatorImpl = new CrtPackageValidatorImpl();
	
				File fXmlFile = new File("C:/Users/tiwarirt/AppData/Roaming/Skype/My Skype Received Files/mapshop-crt-package_971-Re-run_MSHOP-6545_v1.0.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
						
				//optional, but recommended
				doc.getDocumentElement().normalize();
	
				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
						
				NodeList nList = doc.getElementsByTagName("product");
						
				System.out.println("----------------------------");
	
				int skuCount = 0;
				for (int temp = 0; temp < nList.getLength(); temp++) {
	
					Node nNode = nList.item(temp);
							
					//System.out.println("\nCurrent Element :" + nNode.getNodeName());
							
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	
						Element eElement = (Element) nNode;
	
						//System.out.println("Product Tag : " + eElement.getAttribute("product"));
						System.out.println("Sku checking Started for : "+eElement.getElementsByTagName("sku").item(0).getTextContent());
						crtPackageValidatorImpl.checkPhillyRecords(eElement.getElementsByTagName("sku").item(0).getTextContent());
						System.out.println("");
						skuCount ++;
					}
				}
				System.out.println("Total SKU passed is "+skuCount);
		    } catch (Exception e) {
			e.printStackTrace();
		    }
		  }

}
