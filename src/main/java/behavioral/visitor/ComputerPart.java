package behavioral.visitor;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
