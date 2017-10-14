package SingletonPattern;

/**
 * Created by enes on 10/14/2017.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();

        //SingleObject obj = new SingleObject();
    }
}
