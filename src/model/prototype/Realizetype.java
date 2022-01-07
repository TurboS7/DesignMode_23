package model.prototype;

/**
 * Author zss
 * 2021/12/28 11:49 上午
 * model.prototype
 * Realizetype
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 *
 * 克隆一个相同的对象
 **/
public class Realizetype implements Cloneable{
    public static void main(String[] args) {
        /*创建原型*/
        Realizetype realizetype = new Realizetype();
        /*复制原型*/
        Realizetype realizetype1 = null;
        try {
            System.out.println("复制原型");
            realizetype1 = (Realizetype) realizetype.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("原型复制失败");
        }
        System.out.println("realizetype==realizetype1?" + (realizetype == realizetype1));
    }
    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Realizetype)super.clone();
    }
}
