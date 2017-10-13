package creational.singleton;

/**
 * 同步方法的懒汉式，并发安全，但是效率低
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017/10/13 16:38
 */
public class SyncLazySingleton {
    private static SyncLazySingleton instance;
    private SyncLazySingleton(){}
    public static synchronized SyncLazySingleton getInstance(){
        if(instance == null){
            instance = new SyncLazySingleton();
        }
        return instance;
    }
}
