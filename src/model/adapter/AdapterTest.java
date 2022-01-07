package model.adapter;

/**
 * Author zss
 * 2022/1/6 9:13 下午
 * model.adapter
 * SimpleAdapterTest
 **/
public class AdapterTest {
    public static void main(String[] args) {
        Motor gas  = new ElectricAdapter(new GasMotor());
        gas.drive();
        Motor electric = new GasAdapter(new ElectricMotor());
        electric.drive();
    }
}
/*目标接口*/
interface Motor{
    public void drive();
}
/*适配者1：汽油发动机*/
class GasMotor{
    public void gasDriver(){
        System.out.println("汽油发动机驱使小汽车");
    }
}
/*适配者2：电力发动机*/
class ElectricMotor{
    public void electricDriver(){
        System.out.println("电力发动机驱使小汽车");
    }
}
/*适配器1：汽油适配器*/
class GasAdapter implements Motor{
    private ElectricMotor electricMotor;

    public GasAdapter(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }
    @Override
    public void drive() {
        electricMotor.electricDriver();
    }
}
/*适配器2：电力适配器*/
class ElectricAdapter implements Motor{
    private GasMotor gasMotor;

    public ElectricAdapter(GasMotor gasMotor) {
        this.gasMotor = gasMotor;
    }
    @Override
    public void drive() {
        gasMotor.gasDriver();
    }
}
