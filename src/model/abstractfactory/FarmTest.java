package model.abstractfactory;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

/**
 * Author zss
 * 2022/1/6 10:45 上午
 * model.abstractfactory
 * FarmTest
 **/
public class FarmTest {
    public static void main(String[] args) {
        LocalFarm localFarm = (LocalFarm) XMLRead.read();
        Sheep sheep = (Sheep) localFarm.newAnimal();
        Rose rose = (Rose) localFarm.newPlant();
        sheep.show();
        rose.show();
    }
}
interface Animal{
    void show();
}
class Sheep implements Animal{

    @Override
    public void show() {
        System.out.println("i am sheep");
    }
}
class Pig implements Animal{
    @Override
    public void show() {
        System.out.println("i am sheep");
    }
}
interface Plant{
    void show();
}
class Rose implements Plant{
    @Override
    public void show() {
        System.out.println("i am rose!");
    }
}

class Rice implements Plant{

    @Override
    public void show() {
        System.out.println("i am rice!");
    }
}
interface Farm{
    Animal newAnimal();
    Plant newPlant();
}
class LocalFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("国内牧场产了一只羊");
        return (Animal)new Sheep();
    }

    @Override
    public Plant newPlant() {
        System.out.println("国内牧场产了一朵玫瑰");
        return new Rose() ;
    }
}
class InternalFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("国际牧场产了一只猪");
        return new Pig();
    }

    @Override
    public Plant newPlant() {
        System.out.println("国际牧场产了一粒米");
        return new Rice();
    }
}
  class XMLRead{
    public static Object read(){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/config_abstract_factory.xml"));
            String className = document.getElementsByTagName("farmName").item(0).getFirstChild().getNodeValue();
            Class<?> c = Class.forName("model.abstractfactory."+className);
            Object o = c.getDeclaredConstructor().newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}