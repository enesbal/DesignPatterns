package CompositeEntityPattern;

/**
 * Created by enes on 10/30/2017.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
