package behavioral.strategy;

/**
 * 策略：定义一系列的算法，把它们一个个封装起来，并且使他们可互相替换。
 * 本模式使得算法可独立于使用它的客户而变化。
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
