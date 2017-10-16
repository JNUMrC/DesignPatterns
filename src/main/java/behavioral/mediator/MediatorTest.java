package behavioral.mediator;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public class MediatorTest {
    public static void main(String[] args) {
        User john = new User("John ");
        User robert = new User("Robert");
        robert.sendMessage("Hi John!");
        john.sendMessage("Hello Robert!");
    }
}
