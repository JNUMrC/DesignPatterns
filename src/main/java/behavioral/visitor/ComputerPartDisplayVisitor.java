package behavioral.visitor;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("display computer!");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("display keyboard!");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display mouse!");
    }
}
