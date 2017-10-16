package behavioral.command;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
