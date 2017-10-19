package behavioral.memento;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
    public String getState(){
        return state;
    }
}
