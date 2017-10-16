package structural.bridge;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class Circle extends Shape {

    protected Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        drawAPI.drawCircle();
    }
}
