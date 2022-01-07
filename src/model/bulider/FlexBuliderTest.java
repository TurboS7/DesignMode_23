package model.bulider;

import java.util.Date;

/**
 * Author zss
 * 2022/1/6 12:45 下午
 * model.bulider
 * FlexBuliderTest
 **/
public class FlexBuliderTest {
    public static void main(String[] args) {
        Bulider bulider = new MBulider();
        Products products = bulider.bulidDate(new Date(System.currentTimeMillis()))
                .bulidName("衣服")
                .bulidPrice(12.6)
                .bulid();
        System.out.println(products.toString());
    }
}
abstract class Bulider{
    Products products = new Products();
    public abstract Bulider bulidName(String name);
    public abstract Bulider bulidDate(Date date);
    public abstract Bulider bulidPrice(double price);
    public abstract Products bulid();
}
class MBulider extends Bulider{
//    private Products products =new Products();
    @Override
    public Bulider bulidName(String name) {
        products.setName(name);
        return this;
    }

    @Override
    public Bulider bulidDate(Date date) {
        products.setCreatDate(date);
        return this;
    }

    @Override
    public Bulider bulidPrice(double price) {
        products.setPrice(price);
        return this;
    }

    @Override
    public Products bulid() {
        return products;
    }
}
