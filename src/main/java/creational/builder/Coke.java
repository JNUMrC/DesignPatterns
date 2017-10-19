package creational.builder;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:45
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 6.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
