package creational.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();
    public static Shape getShape(String type){
        Shape shape = shapeMap.get(type);
        return (Shape) shape.clone();
    }
    public static void loadCache(){
        Shape shape = new Circle();
        shape.setId("1");
        shapeMap.put(shape.getId(),shape);
        shape = new Rectangle();
        shape.setId("2");
        shapeMap.put(shape.getId(),shape);
        shape = new Square();
        shape.setId("3");
        shapeMap.put(shape.getId(),shape);
    }
}
