package principle;

/**
 * 依赖倒置原则
 */
public class DIPtest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.Shopping(new SZShop());
        customer.Shopping(new WFJShop());
    }
    static class Customer {
//        public void shopping(WFJShop shop) {
//            //购物
//            System.out.println(shop.sell());
//        }
//        public void shopping(SZShop shop) {
//            //购物
//            System.out.println(shop.sell());
//        }
        /*将返方法的参数抽象出来*/
        public void Shopping(Shop shop){
            System.out.println(shop.sell());
        }
    }
    static class WFJShop implements Shop{
        @Override
        public String sell() {
            return "王府井超市商品：北京烤鸭、冰糖葫芦";
        }
    }
     static class SZShop implements Shop{
        @Override
        public String sell() {
            return "深圳超市商品：椰子，烤鱼";
        }
    }
    interface Shop{
      String  sell();
    }
}
