package behavioral.state;

/**
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
