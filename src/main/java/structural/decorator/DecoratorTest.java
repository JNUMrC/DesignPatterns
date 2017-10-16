package structural.decorator;

/**
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
