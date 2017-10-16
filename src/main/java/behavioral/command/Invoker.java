package behavioral.command;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}
