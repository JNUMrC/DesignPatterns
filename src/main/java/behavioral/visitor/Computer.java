package behavioral.visitor;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class Computer implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
