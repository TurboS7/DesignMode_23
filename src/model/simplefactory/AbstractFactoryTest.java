package model.simplefactory;

import java.awt.*;
import javax.swing.*;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
/**
 * Author zss
 * 2021/12/31 3:59 下午
 * model.simplefactory
 * AnimalFarmTest
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        try {
            Product product;
            Factory factory;
            factory = (Factory) ReadXML1.getObject();
            product = factory.makeProduct();
            product.show();
        } catch (Exception e) {
//            System.out.println(e.getMessage());
        }
    }
}
    /*抽象产品*/
    interface Product{
       void show();
    }
    /*抽象工厂*/
    interface Factory{

        Product makeProduct( );
    }
    /*具体产品A的实现*/
     class ProductA implements Product{

        @Override
        public void show() {
            System.out.println("产品A");
        }
    }
    /*具体产品B的实现*/
    class ProductB implements Product{
        @Override
        public void show() {
            System.out.println("产品B");
        }
    }
    /*具体工厂A的实现*/
    class FactoryA implements Factory{
        @Override

        public Product makeProduct() {
            System.out.println("生产了一个产品A" );
            return new ProductA();
        }
    }
    /*具体工厂B的实现*/
      class FactoryB implements Factory{
        @Override
        public Product makeProduct() {
            System.out.println("生产了一个产品B" );
            return new ProductB();
        }
    }



   class ReadXML1 {
      //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
      public static Object getObject() {
          try {
              //创建文档对象
             DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
             DocumentBuilder builder = factory.newDocumentBuilder();
             Document document = builder.parse(new File("src/config1.xml"));
             String className ="model.simplefactory." + document.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();
              Class<?> c = Class.forName(className);
              Object obj = c.getDeclaredConstructor().newInstance();
             return obj;
          } catch (Exception e) {
              e.printStackTrace();
              return null;
          }
      }
  }
