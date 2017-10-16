package creational.builder;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:38
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 8.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
