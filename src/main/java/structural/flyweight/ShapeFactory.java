package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class ShapeFactory {
    private static final Map<String,Shape> map = new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle = (Circle) map.get(color);
        if(circle == null){
            circle = new Circle(color);
            map.put(color,circle);
            System.out.println("creating circle of color: "+color);
        }
        return circle;
    }
}
