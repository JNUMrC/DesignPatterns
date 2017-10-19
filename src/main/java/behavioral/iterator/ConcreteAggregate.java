package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    public int count(){
        return items.size();
    }
    public Object getItem(int index){
        return items.get(index);
    }
}
