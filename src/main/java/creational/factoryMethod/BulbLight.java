package creational.factoryMethod;

public class BulbLight implements ILight {
    @Override
    public void turnOn() {
        System.out.println("BulbLight turn on!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("BulbLight turn off!!!");
    }
}
