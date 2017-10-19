package behavioral.templateMethod;

/**
 * 模板方法：定义一个操作的算法骨架，而将一些步骤延迟到子类中，模板方法使得子类可以不改变一个算法的结构
 * 即可重定义该算法的某些特定步骤
 * Created by Administrator on 2017\10\15 0015.
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
        System.out.println("");
        game = new Cricket();
        game.play();
    }
}
