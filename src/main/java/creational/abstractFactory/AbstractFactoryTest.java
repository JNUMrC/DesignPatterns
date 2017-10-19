package creational.abstractFactory;

/**
 * 抽象工厂：提供一个创建一系列或相关依赖对象的接口，而无需指定它们具体的类。
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:37
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
//        String key = "sqlserver";
        String key = "access";
        IFactory factory = FactoryProductor.getFactory(key);
        IUser user = factory.createUser();
        IDepartment department = factory.createDepartment();
        System.out.println("user: "+user.getClass().getName());
        System.out.println("department: "+department.getClass().getName());
    }
}
