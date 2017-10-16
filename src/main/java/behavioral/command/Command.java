package behavioral.command;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
