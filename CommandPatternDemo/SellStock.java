package CommandPatternDemo;

/**
 * Created by enes on 10/20/2017.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();

    }
}
