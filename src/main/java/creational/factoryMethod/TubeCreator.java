package creational.factoryMethod;

public class TubeCreator implements ICreator {
    @Override
    public ILight factory() {
        return new TubeLight();
    }
}
