package behavioral.observer;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new ConcreteObserver1(subject);
        new ConcreteObserver2(subject);
        subject.notifyAllObservers();
    }
}
