package MediatorPattern;

/**
 * Created by enes on 10/21/2017.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John");
        john.sendMessage("Hello! Robert!");
    }
}
