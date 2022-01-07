package principle;

import java.awt.*;

/**
 * Author zss
 * 2021/12/30 9:29 上午
 * model
 * Test
 * 合成复用原则：如果要使用继承关系，则必须严格遵循里氏替换原则。
 * 合成复用原则是通过将已有的对象纳入新对象中，作为新对象的成员对象来实现的，新对象可以调用已有对象的功能，从而达到复用。
 **/

public class CRPTest {
   static class Car{
        private   Colors colors;

        public Colors getColors() {
            return colors;
        }

        public void setColors(Colors colors) {
            this.colors = colors;
        }

        public Car() {
        }
        public void move(){

        }

       @Override
       public String toString() {
           return "Car{" +
                   "colors=" + colors +
                   '}';
       }
   }
    static class GasonlineCar extends Car{
        @Override
        public String toString() {
            return super.toString();
        }
    }
    static class ElectricCar extends Car{
        @Override
        public void move() {
            super.move();
        }
    }
    static class Colors{
      private  int color;
        public Colors(int color) {
            this.color = color;
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }
    }
    public static void main(String[] args) {
        GasonlineCar gasonlineCar = new GasonlineCar();
        gasonlineCar.setColors(new Colors(123));
        System.out.println(gasonlineCar.getColors().getColor());
    }

}
