package creational.builder;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class VegBurger extends Burger{
    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "VegBurger";
    }
}
