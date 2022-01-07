package model.proxy;

/**
 * Author zss
 * 2022/1/6 4:03 下午
 * model.proxy
 * SimpleProxyTest
 **/
public class SimpleProxyTest {
    public static void main(String[] args) {
        CatCoffeeProxy catCoffeeProxy = new CatCoffeeProxy();
        catCoffeeProxy.sell();
    }
}
interface CoffeeStore{
    void sell();
}
class CatCoffeeStore implements CoffeeStore{
    @Override
    public void sell() {
        System.out.println("售卖猫咖啡！");
    }
}
class CatCoffeeProxy implements CoffeeStore{
   private CatCoffeeStore catCoffee;
    @Override
    public void sell() {
        if (catCoffee==null){
            catCoffee = new CatCoffeeStore();
        }
        preSell();
        catCoffee.sell();
        beginSell();
    }
    private void preSell(){
        System.out.println("售前准备！");
    }
    private void beginSell(){
        System.out.println("开始售卖");
    }
}
