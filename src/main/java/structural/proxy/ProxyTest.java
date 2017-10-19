package structural.proxy;

/**
 * 代理：为其他对象提供一种代理以控制对这个对象的访问。
 * Created by Administrator on 2017\10\15 0015.
 */
public class ProxyTest {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("test.jpg");
        proxyImage.display();
        System.out.println("/*******分隔*******/");
        proxyImage.display();
    }
}
