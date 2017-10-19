package behavioral.observer;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class ConcreteObserver2 extends Observer{
    public ConcreteObserver2(Subject subject) {
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("concrete observer2 update!");
    }
}
