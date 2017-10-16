package behavioral.memento;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        Memento memento = originator.createMemento();
        CareTaker taker = new CareTaker(memento);
        originator.setState("off");
        originator.show();
        originator.setMemento(taker.getMemento());
        originator.show();
    }
}
