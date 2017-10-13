package creational.factoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
//        ICreator creator = new BulbCreator();
        ICreator creator = new TubeCreator();
        ILight light = creator.factory();
        light.turnOn();
        light.turnOff();
    }
}
