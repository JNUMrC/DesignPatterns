package behavioral.iterator;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public class ConcreteIterator implements Iterator {
    private  ConcreteAggregate aggregate;
    private int current = 0;
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItem(0);
    }

    /**
     * 未判断边界，每次调用之前需调用isDone方法
     * @return
     */
    @Override
    public Object next() {
        return aggregate.getItem(++current);
    }

    @Override
    public boolean isDone() {
        return current == aggregate.count();
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
