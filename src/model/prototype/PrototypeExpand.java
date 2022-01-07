package model.prototype;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Author zss
 * 2021/12/28 2:01 下午
 * model.prototype
 * PrototypeExpand
 * 原型模式的拓展
 *
 **/
public class PrototypeExpand  {
    public static void main(String[] args) {
        AnimalManager manager = new AnimalManager();
      Animal animal = manager.getAnimal("Cat");
      animal.getDestance();
      Animal animal1 = manager.getAnimal("Dog");
      animal1.getDestance();
    }
   interface Animal extends Cloneable {
       Object clone();
       void getDestance();
   }
   static class Dog implements Animal{
        @Override
        public Object clone() {
            Dog dog = null;
            try {
                dog = (Dog) super.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("克隆失败");
            }
            return dog;
        }

        @Override
        public void getDestance() {
            System.out.println("输入速速");
            Scanner scanner = new Scanner(System.in);
            double speed = scanner.nextDouble();
            System.out.println("输入时间");
            Scanner scanner1 = new Scanner(System.in);
            double time = scanner1.nextDouble();
            System.out.println("dog的运动距离为"+speed*time);
        }
    }
   static class Cat implements Animal{
        @Override
        public Object clone() {
            Cat cat = null;
            try {
                cat = (Cat) super.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("克隆失败");
            }
            return cat;
        }

        @Override
        public void getDestance() {
            System.out.println("输入速速");
            Scanner scanner = new Scanner(System.in);
            double speed = scanner.nextDouble();
            System.out.println("输入时间");
            Scanner scanner1 = new Scanner(System.in);
            double time = scanner1.nextDouble();
            System.out.println("cat的运动距离为"+speed*time);
        }
    }
    static class AnimalManager{
       private HashMap<String,Animal> map = new HashMap<String,Animal>();

        public AnimalManager() {
            map.put("Cat",new Cat());
            map.put("Dog",new Dog());
        }
        public Animal getAnimal(String key){
          Animal animal = map.get(key);
            return (Animal) animal.clone();
        }
    }
}
