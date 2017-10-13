package creational.prototype;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle method draw run!!!");
    }
}
