package behavioral.observer;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class ConcreteObserver1 extends Observer{
    public ConcreteObserver1(Subject subject) {
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("concrete observer1 update!");
    }
}
