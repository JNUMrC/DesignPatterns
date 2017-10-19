package behavioral.templateMethod;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("initialize football game!");
    }

    @Override
    void startGame() {
        System.out.println("start football game!");
    }

    @Override
    void endGame() {
        System.out.println("end football game!");
    }
}
