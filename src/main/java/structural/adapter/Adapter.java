package structural.adapter;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:37
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
