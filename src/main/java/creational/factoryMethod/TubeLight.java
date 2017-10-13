package creational.factoryMethod;

public class TubeLight implements ILight {
    @Override
    public void turnOn() {
        System.out.println("TubeLight turn on!!!");
    }

    @Override
    public void turnOff() {
        System.out.println("TubeLight turn off!!!");
    }
}
