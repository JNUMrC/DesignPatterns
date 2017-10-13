package creational.singleton;

/**
 * 懒汉式，非线程安全,不推荐
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017/10/13 16:27
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
