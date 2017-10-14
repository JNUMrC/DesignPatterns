package creational.builder;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
