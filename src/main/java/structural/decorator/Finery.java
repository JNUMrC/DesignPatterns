package structural.decorator;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class Finery extends Person {
    protected Person component;
    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }
    }
}
