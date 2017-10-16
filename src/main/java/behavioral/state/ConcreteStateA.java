package behavioral.state;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
