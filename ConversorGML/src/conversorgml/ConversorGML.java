package conversorgml;

import java.io.BufferedWriter;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConversorGML {

    public static void main(String[] args) {
        try {
//creating a constructor of file class and parsing an XML file  
            File file = new File("recintos.gml");
//an instance of factory that gives a document builder  
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//an instance of builder to parse the specified xml file  
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("LinearRing");
// nodeList is not iterable, so we are using for loop  
            Node node = nodeList.item(0);
            ArrayList<Punto> punticos = null;
            System.out.println("\nNode Name :" + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Lista de puntos: " + eElement.getElementsByTagName("posList").item(0).getTextContent());
                String listaPuntos = eElement.getElementsByTagName("posList").item(0).getTextContent();
                String[] puntos;
                puntos = listaPuntos.split(" ");
                punticos = Utilidades.crearPuntos(puntos);
                Punto.guardarPuntos(punticos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
