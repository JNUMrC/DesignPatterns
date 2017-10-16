package behavioral.interpreter;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class InterpreterTest {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression married = getMarriedWomanExpression();
        System.out.println("John is male? "+isMale.interpret("John"));
        System.out.println("Julie is married? "+married.interpret("Julie Married"));
    }
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
