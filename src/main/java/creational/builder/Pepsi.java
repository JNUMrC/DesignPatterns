package creational.builder;

/**
 * Created by Administrator on 2017\10\14 0014.
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
