package behavioral.templateMethod;

/**
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
