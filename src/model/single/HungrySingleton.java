package model.single;

/**
 * Author zss
 * 2021/12/27 3:06 下午
 * model.single
 * HungrySingleton
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 **/
public class HungrySingleton {

    public static void main(String[] args) {
        HungrySingleton.getInstance().setName("1232");
        System.out.println(HungrySingleton.getInstance().getName());
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
}
