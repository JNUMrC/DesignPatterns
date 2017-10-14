package creational.builder;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
