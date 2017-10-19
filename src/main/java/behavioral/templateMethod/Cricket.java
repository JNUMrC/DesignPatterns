package behavioral.templateMethod;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("initialize cricket game!");
    }

    @Override
    void startGame() {
        System.out.println("start cricket game!");
    }

    @Override
    void endGame() {
        System.out.println("end cricket game!");
    }
}
