package creational.abstractFactory;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:38
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
