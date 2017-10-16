package behavioral.strategy;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();
        context = new Context(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
