package model.bulider;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Author zss
 * 2022/1/6 11:52 上午
 * model.bulider
 * ProductBulider
 **/
public class SimpleBuliderTest {
    public static void main(String[] args) {
        SimpleBulider bulider = new ABulider();
        Director director = new Director((ABulider) bulider);
        ABulider aBulider = director.getBulider();
        System.out.println(aBulider.getProducts().toString());
    }
}
abstract class SimpleBulider{
    Products products = new Products();
    public abstract void bulidName();
    public abstract void bulidPrice();
    public abstract void bulidDate();
    public Products getProducts() {
        return products;
    }
}
class ABulider extends SimpleBulider{

    @Override
    public void bulidName() {
        System.out.println("bulid name");
        products.setName("name_1");
    }

    @Override
    public void bulidPrice() {
        System.out.println("bulid price");
        products.setPrice(12.5);
    }

    @Override
    public void bulidDate() {
        System.out.println("bulid date");
        products.setCreatDate(new Date(System.currentTimeMillis()));
    }

    public Products bulid() {
        return products;
    }
}

class Director{
   private ABulider bulider;

    public Director(ABulider bulider) {
        this.bulider = bulider;
    }

    public ABulider getBulider() {
        bulider.bulidName();
        bulider.bulidDate();
        bulider.bulidPrice();
        return bulider;
    }
}