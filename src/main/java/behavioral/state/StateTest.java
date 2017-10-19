package behavioral.state;

/**
 * 状态：允许一个对象在其内部状态改变时改变它的行为，让对象看起来似乎修改了它的类。
 * Created by Administrator on 2017\10\17 0017.
 */
public class StateTest {
    public static void main(String[] args) {
        ConcreteStateA stateA = new ConcreteStateA();
        Context context = new Context(stateA);
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
