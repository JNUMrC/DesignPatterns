package creational.prototype;

/**
 * 原型：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\17 0017 22:05
 */
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
