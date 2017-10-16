package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017\10\17 0017.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
