package behavioral.iterator;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public interface Iterator {
    Object first();
    Object next();
    boolean isDone();
    Object currentItem();
}
