package behavioral.memento;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class CareTaker {
    private Memento memento;

    public CareTaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
