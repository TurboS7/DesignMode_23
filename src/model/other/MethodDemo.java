package model.other;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author zss
 * 2021/12/31 5:57 下午
 * model.other
 * Test
 **/
class P{
    public void t1(){}

    void t2(){}

    private void t3(){}

}

class People extends P{
    public void sayHi() {
        System.out.println("sayHi()");

    }

    public void sayHello(String name) {
        System.out.println("sayHello(String name)   " + "name = " + name);

    }

    private void sayGoodBye(String name, int age) {
        System.out.println("sayGoodBye(String name, int age)   " + "name = " + name + "  age = " + age);

    }

}

public class MethodDemo {
    public static void main(String[] args) throws Exception {
        Class clazz = People.class;

//获取类自身及父类所有public方法

        Method ms[] = clazz.getMethods();

        for (Method m : ms) {
            System.out.println(m);

        }

        System.out.println("---------------------------");

//获取类自身所有方法(不会获取父类方法)

        ms = clazz.getDeclaredMethods();

        for (Method m : ms) {
            System.out.println(m);

        }

        System.out.println("---------------------------");

//只能获取父类中的public方法，无法获取到父类的默认权限和private权限方法

        Method m = clazz.getMethod("t1", null);//public void com.reflex.P.t1()

        System.out.println(m);

        m = clazz.getMethod("sayHello", String.class);

        System.out.println(m);

//Exception in thread "main" java.lang.NoSuchMethodException: com.reflex.People.sayGoodBye(java.lang.String, int)

//getMethod方法只能获取public的

//        m = clazz.getMethod("sayGoodBye", String.class,int.class);

//        System.out.println(m);

        m = clazz.getDeclaredMethod("sayGoodBye", String.class,int.class);

        System.out.println(m);

//带Declared的无法获取父类中的方法

//        m = clazz.getDeclaredMethod("t1", null);//Exception in thread "main" java.lang.NoSuchMethodException:com.reflex.People.t1()

//        System.out.println(m);

    }

}
