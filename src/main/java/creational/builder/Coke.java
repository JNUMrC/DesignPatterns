package creational.builder;

/**
 * Created by Administrator on 2017\10\14 0014.
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
