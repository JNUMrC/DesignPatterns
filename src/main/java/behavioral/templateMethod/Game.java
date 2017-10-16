package behavioral.templateMethod;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startGame();
    abstract void endGame();
    public void play(){
        initialize();
        startGame();
        endGame();
    }
}
