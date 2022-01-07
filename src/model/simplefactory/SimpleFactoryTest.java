package model.simplefactory;

/**
 * Author zss
 * 2021/12/30 5:25 下午
 * model.simplefactory
 * SimpleFactoryTest
 **/
public class SimpleFactoryTest  {
    /*抽象产品*/
   interface Product{
       void showInstrument();
   }
   /*具体产品A*/
  static class ProductA implements Product{
       @Override
       public void showInstrument() {
           System.out.println("i am productA");
       }
   }
  static class ProductB implements Product{
        @Override
        public void showInstrument() {
            System.out.println("i am productB");
        }
    }
    static class Constant{
       public static final int PRODUCTA = 0;
       public static final int PRODUCTB = 1;
       public static final int PRODUCTC = 2;
       public static final int PRODUCTD = 3;
    }

    static class Factory{
       public static Product makeProducts(int i){
           Product product = null;
           switch (i){
               case Constant.PRODUCTA:
                   product = new ProductA();
                   break;
               case Constant.PRODUCTB:
                   product = new ProductB();
                   break;
           }
           return product;
       }
    }

    public static void main(String[] args) {
        Product product = Factory.makeProducts(Constant.PRODUCTA);
        product.showInstrument();

    }

}
