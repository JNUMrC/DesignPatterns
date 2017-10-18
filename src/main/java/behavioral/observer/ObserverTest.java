package behavioral.observer;

/**
 * 观察者：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
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
