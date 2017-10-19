package behavioral.strategy;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void operate() {
        System.out.println("strategy A!");
    }
}
