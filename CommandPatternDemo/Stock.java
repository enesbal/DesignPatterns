package CommandPatternDemo;

/**
 * Created by enes on 10/20/2017.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: " + name + ", Quantity:"
        +quantity+" ] boucht");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+ name+ ", Quantity: "
        +quantity + " ] sold");
    }
}
