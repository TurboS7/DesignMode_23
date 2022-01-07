package model.simplefactory;

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
 * 2022/1/4 3:37 下午
 * model.simplefactory
 * FactoryTest
 **/
public class FactoryTest {
    public static void main(String[] args) {
        Factory1 factory1 = (Factory1) XMLRead.readXml();
        Products mkp = factory1.mkp();
        mkp.show();
    }
}
interface Factorys{
    Products mkp();
}
interface Products{
    void show();
}
class Factory1 implements Factorys{
    @Override
    public Products mkp() {
        System.out.println("Factory1 生产了一个产品 Product2");
        return new Products1();
    }
}
class Factory2 implements Factorys{
    @Override
    public Products mkp() {
        System.out.println("Factory2");
        return new Product2();
    }
}
class Products1 implements Products{
    @Override
    public void show() {
        System.out.println("Products1");
    }
}
class Product2 implements Products{
    @Override
    public void show() {
        System.out.println("Products2");
    }
}
class XMLRead{
    public  static Object readXml(){

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/factory.xml"));
            String className = "model.simplefactory."+ document.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();
            Class<?> cls = Class.forName(className);
            if (cls!=null){
                return cls.getDeclaredConstructor().newInstance();
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}