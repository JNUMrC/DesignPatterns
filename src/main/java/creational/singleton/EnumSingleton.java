package creational.singleton;

/**
 * 枚举实现单例模式，被Effective Java作者称为1.5以后的最优单例实现
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017/10/13 17:10
 */
public enum EnumSingleton {
    INSTANCE;
    public void whateverMethod(){
        System.out.println("method run!!!");
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.whateverMethod();
    }
}
