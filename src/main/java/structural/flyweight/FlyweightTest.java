package structural.flyweight;

/**
 * 享元：为运用共享技术有效地支持大量细粒度的对象。
 * Created by Administrator on 2017\10\15 0015.
 */
public class FlyweightTest {
    private static final String[] colors = {"Red", "Green", "Yellow", "Blue", "White", "Black"};
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int) (Math.random()*colors.length)];
    }
    private static int getRandomX(){
        return (int) (Math.random()*100);
    }
    private static int getRandomY(){
        return (int) (Math.random()*100);
    }
}
