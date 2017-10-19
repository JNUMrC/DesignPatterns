package structural.facade;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("method group A");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        System.out.println("method group B");
        two.methodTwo();
        three.methodThree();
    }
}
