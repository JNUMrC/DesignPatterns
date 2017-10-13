package creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        System.out.println("Shape："+shape.getType()+" "+shape.toString());
        shape = ShapeCache.getShape("2");
        System.out.println("Shape："+shape.getType()+" "+shape.toString());
        shape = ShapeCache.getShape("3");
        System.out.println("Shape："+shape.getType()+" "+shape.toString());
        shape = ShapeCache.getShape("3");
        System.out.println("Shape："+shape.getType()+" "+shape.toString());
    }
}
