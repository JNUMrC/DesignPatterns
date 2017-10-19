package structural.decorator;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class Person {
    public Person() {
    }
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("装扮的："+name);
    }
}
