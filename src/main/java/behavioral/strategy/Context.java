package behavioral.strategy;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.operate();
    }
}
