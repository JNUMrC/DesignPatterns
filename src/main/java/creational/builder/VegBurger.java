package creational.builder;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:39
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
