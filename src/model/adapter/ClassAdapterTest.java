package model.adapter;

/**
 * Author zss
 * 2022/1/6 9:18 下午
 * model.adapter
 * ClassAdapterTest
 * 类适配
 **/
public class ClassAdapterTest {
    public static void main(String[] args) {
        ClassTarget target = new ClassAdapter();
        target.request();
    }
}
/*目标接口*/
interface ClassTarget{
    void request();
}
/*适配者接口*/
class Adaptee{
    public void ARequest(){
        System.out.println("适配者的业务代码被调用!!!");
    }
}
//类适配器类
class ClassAdapter extends Adaptee implements ClassTarget{
    @Override
    public void request() {
        ARequest();
    }
}
