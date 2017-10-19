package creational.builder;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:45
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
