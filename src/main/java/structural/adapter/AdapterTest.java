package structural.adapter;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:36
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
