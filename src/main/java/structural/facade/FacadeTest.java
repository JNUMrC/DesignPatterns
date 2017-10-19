package structural.facade;

/**
 * 外观：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * Created by Administrator on 2017\10\15 0015.
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
