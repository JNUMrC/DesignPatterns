package structural.decorator;

/**
 * 装饰：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更加灵活。
 * Created by Administrator on 2017\10\14 0014.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        Person mrc = new Person("mrc");

        sneakers.decorate(mrc);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();
    }
}
