package structural.flyweight;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("draw circle color: "+color+", x: "+x+", y: "+y+", radius: "+radius);
    }
}
