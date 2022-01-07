package model.adapter;

/**
 * Author zss
 * 2022/1/6 9:51 下午
 * model.adapter
 * ObjectAdapterTest
 **/
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ObjectAdapter adapter = new ObjectAdapter(adaptee);
        adapter.request();
    }
}
class ObjectAdapter implements ClassTarget{
private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.ARequest();
    }
}