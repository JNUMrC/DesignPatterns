package creational.abstractFactory;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class FactoryProductor {
    public static IFactory getFactory(String key){
        IFactory factory = null;
        switch (key){
            case "sqlserver":
                factory = new SqlserverFactory();
                break;
            case "access":
                factory = new AccessFactory();
                break;
            default:
                throw new IllegalArgumentException("wrong key:"+key);
        }
        return factory;
    }
}
