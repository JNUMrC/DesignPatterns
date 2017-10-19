package structural.adapter;

/**
 * 适配器：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于
 * 接口不兼容而不能在一起工作的那些类可以一起工作。
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:36
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
