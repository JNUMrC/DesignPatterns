package creational.singleton;

/**
 * 并发安全的懒汉式，双检锁/双重校验锁（DCL，即double-checked locking），实现麻烦了点
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017/10/13 16:27
 */
public class ConcurrentLazySingleton {
    private static ConcurrentLazySingleton instance;

    private ConcurrentLazySingleton(){}

    public static ConcurrentLazySingleton getInstance() {
        if(instance == null){
            synchronized (ConcurrentLazySingleton.class){
                if(instance == null){
                    instance = new ConcurrentLazySingleton();
                }
            }
        }
        return instance;
    }
}
