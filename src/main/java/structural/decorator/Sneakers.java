package structural.decorator;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class Sneakers extends Finery {
    @Override
    public void show() {
        System.out.printf("sneakers ");
        super.show();
    }
}
