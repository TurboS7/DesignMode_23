package model.prototype;

/**
 * Author zss
 * 2021/12/28 1:52 下午
 * model.prototype
 * IDCard
 * 克隆相似的对象。
 **/
public class IDCard implements Cloneable{
    private String id;
    private String name;
    private String address;

    public IDCard(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (IDCard)super.clone();
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        IDCard card = new IDCard("12","tom","China");
        IDCard card1 = (IDCard) card.clone();
        card1.setId("123456");
        card1.setName("jack");
        System.out.println(card1.toString());
    }
}
