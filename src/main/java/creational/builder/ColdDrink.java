package creational.builder;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:38
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
