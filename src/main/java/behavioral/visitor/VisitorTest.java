package behavioral.visitor;

/**
 * 访问者：表示一个作用于某对象结构中的各元素的操作。
 * 它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * Created by Administrator on 2017\10\17 0017.
 */
public class VisitorTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();
        ComputerPartDisplayVisitor visitor = new ComputerPartDisplayVisitor();
        computer.accept(visitor);
        keyBoard.accept(visitor);
        mouse.accept(visitor);
    }
}
