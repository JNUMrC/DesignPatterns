package creational.builder;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 12.0f;
    }

    @Override
    public String name() {
        return "ChickenBurger";
    }
}
