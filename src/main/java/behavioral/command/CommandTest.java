package behavioral.command;

/**
 * 命令：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；
 * 可以对请求排队或记录请求日志，以及支持可撤销的操作。
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
