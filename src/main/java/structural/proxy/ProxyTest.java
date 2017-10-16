package structural.proxy;

/**
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
