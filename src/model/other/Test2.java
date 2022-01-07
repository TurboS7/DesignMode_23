package model.other;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Author zss
 * 2022/1/4 3:01 下午
 * model.other
 * Test2
 **/
public class Test2 {
    public static void main(String[] args) {

        try {
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder =  factory.newDocumentBuilder();
//            Document document = builder.parse(new File("src/config1.xml"));
//            String className ="model.simplefactory." + document.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();

            Class<?> c = Class.forName("model.other.Student");
            System.out.println(c);
            Object obj = c.newInstance();
            System.out.println(obj.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }  catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
