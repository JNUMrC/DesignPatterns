package creational.abstractFactory;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
