package structural.decorator;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.printf("t-shirts ");
        super.show();
    }
}
