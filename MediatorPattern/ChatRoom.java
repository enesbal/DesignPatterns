package MediatorPattern;

import java.util.Date;

/**
 * Created by enes on 10/21/2017.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+ " [" + user.getName() +
        "] : " + message );
    }
}
