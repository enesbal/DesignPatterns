package MediatorPattern;

/**
 * Created by enes on 10/21/2017.
 */
public class User {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public User(String name){
        this.name = name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }


}
