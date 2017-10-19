package behavioral.mediator;

import java.util.Date;

/**
 * Created by Administrator on 2017\10\16 0016.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+" ["+user.getName()+"] : "+message);
    }
}
