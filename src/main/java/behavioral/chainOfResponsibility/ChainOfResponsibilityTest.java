package behavioral.chainOfResponsibility;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        ConcreteHandle2 handle2 = new ConcreteHandle2();
        ConcreteHandle1 handle1 = new ConcreteHandle1();
        ConcreteHandle3 handle3 = new ConcreteHandle3();
        handle1.setSuccessor(handle2);
        handle2.setSuccessor(handle3);
        handle1.handleRequest(12);
        handle1.handleRequest(25);
        handle1.handleRequest(9);
    }
}
