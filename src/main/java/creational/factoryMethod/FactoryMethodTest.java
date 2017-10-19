package creational.factoryMethod;

/**
 * 工厂方法：定义一个创建对象的接口，让子类决定实例化哪一个类，工厂模式使一个类的实例化延迟到其子类。
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\17 0017 22:05
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
//        ICreator creator = new BulbCreator();
        ICreator creator = new TubeCreator();
        ILight light = creator.factory();
        light.turnOn();
        light.turnOff();
    }
}
