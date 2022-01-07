package model.single;

/**
 * Author zss
 * 2021/12/23 4:22 下午
 * model.single
 * LazySingleton 懒汉模式
 * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
 **/
public class LazySingleton {
private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance(){
        if (instance==null){
            instance = new LazySingleton();
            System.out.println("创建单例成功");
        }else {
            System.out.println("单例已存在");
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        if (lazySingleton==lazySingleton1){
            System.out.println("他们是相同的对象");
        }
    }
}