package creational.abstractFactory;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:38
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
