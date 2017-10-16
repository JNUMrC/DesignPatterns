package structural.bridge;

/**
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
