package behavioral.memento;

/**
 * 备忘录：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个对象。
 * 这样以后就可将该对象恢复到原先保存的状态。
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
