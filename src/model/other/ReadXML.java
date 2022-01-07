package model.other;

import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import org.w3c.dom.*;
import java.io.IOException;

/**
 * Author zss
 * 2021/12/31 5:25 下午
 * model.other
 * ReadXML
 **/
public class ReadXML {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/test.xml"));
            NodeList list = document.getElementsByTagName("VALUE");

            for (int i = 0; i < list.getLength(); i++) {
                System.out.println(document.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
                System.out.println(document.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }
}
