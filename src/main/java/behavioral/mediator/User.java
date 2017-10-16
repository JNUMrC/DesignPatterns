package behavioral.mediator;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}
