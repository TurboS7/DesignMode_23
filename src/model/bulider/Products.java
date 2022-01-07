package model.bulider;

import java.util.Date;

/**
 * Author zss
 * 2022/1/6 11:52 上午
 * model.bulider
 * Products
 **/
public class Products {
    private String name;
    private Date creatDate;
    private  double price;

    public String getName() {
        return name;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", creatDate=" + creatDate +
                ", price=" + price +
                '}';
    }
}
