package creational.abstractFactory;

/**
 * Created by Administrator on 2017\10\14 0014.
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
