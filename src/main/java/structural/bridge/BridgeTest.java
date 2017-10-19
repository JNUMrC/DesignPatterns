package structural.bridge;

/**
 * 桥接：将抽象部分与它的实现部分分离，使它们都可以独立的变化。
 * Created by Administrator on 2017\10\14 0014.
 */
public class BridgeTest {
    public static void main(String[] args) {
        DrawAPI drawAPI = new RedDraw();
//        DrawAPI drawAPI = new GreenDraw();
        Circle circle = new Circle(drawAPI);
        circle.draw();
    }
}
