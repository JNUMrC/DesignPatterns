package creational.singleton;

/**
 * 饿汉式，线程安全
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017/10/13 16:24
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
