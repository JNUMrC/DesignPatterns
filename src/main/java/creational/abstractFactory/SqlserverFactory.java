package creational.abstractFactory;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class SqlserverFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
