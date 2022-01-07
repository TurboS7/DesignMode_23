package model.other;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Author zss
 * 2021/12/31 6:29 下午
 * model.other
 * Test
 **/
 class Test {
    public static void main(String[] args) {
        Class aClass = Test1.class;
        Method[] methods = aClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
        Test1 test1 = new Test1("123");
        try {
            System.out.println(methods[0].invoke(test1));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
class Test1{
    private String name;

    public Test1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
