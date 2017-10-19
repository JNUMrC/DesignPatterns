package behavioral.mediator;

/**
 * 中介者：用一个中介对象来封装一系列交互。中介者使各对象不需要显式地互相引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。
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
