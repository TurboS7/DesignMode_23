package model.adapter;

/**
 * Author zss
 * 2022/1/6 10:17 下午
 * model.adapter
 * DoubleAdapterTest
 **/
public class DoubleAdapterTest {
    public static void main(String[] args) {
        TargetA a = new DoubleAdapter(new ObjB());
        a.tarRequestA();
        TargetB b = new DoubleAdapter(new ObjA());
        b.tarRequestB();
    }
}
//目标接口
interface TargetA{
    public void tarRequestA();
}
//适配者接口
interface TargetB{
    public void tarRequestB();
}
//目标实现
class ObjA implements TargetA{
    @Override
    public void tarRequestA() {
        System.out.println("ObjA的getA方法被调用！");
    }
}
//适配者实现
class ObjB implements TargetB{

    @Override
    public void tarRequestB() {
        System.out.println("ObjB的getB方法被调用！");
    }
}
//双向适配器
class DoubleAdapter implements TargetA,TargetB{
    private ObjA objA;
    private ObjB objB;

    public DoubleAdapter(ObjA objA) {
        this.objA = objA;
    }

    public DoubleAdapter(ObjB objB) {
        this.objB = objB;
    }

    @Override
    public void tarRequestA() {
        objB.tarRequestB();
    }

    @Override
    public void tarRequestB() {
        objA.tarRequestA();
    }
}