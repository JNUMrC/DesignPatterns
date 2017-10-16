package behavioral.visitor;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(KeyBoard keyBoard);
    void visit(Mouse mouse);
}
