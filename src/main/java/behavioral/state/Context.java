package behavioral.state;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("current state: "+this.state);
    }

    public void request(){
        state.handle(this);
    }
}
