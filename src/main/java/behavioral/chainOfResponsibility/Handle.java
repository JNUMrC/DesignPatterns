package behavioral.chainOfResponsibility;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public abstract class Handle {
    protected Handle successor;

    public void setSuccessor(Handle successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
