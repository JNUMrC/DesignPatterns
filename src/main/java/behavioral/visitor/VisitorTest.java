package behavioral.visitor;

/**
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
