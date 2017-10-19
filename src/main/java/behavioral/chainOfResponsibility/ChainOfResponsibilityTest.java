package behavioral.chainOfResponsibility;

/**
 * 职责链：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
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
