package creational.factoryMethod;

public class BulbCreator implements ICreator {
    @Override
    public ILight factory() {
        return new BulbLight();
    }
}
