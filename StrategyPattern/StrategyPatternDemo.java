package StrategyPattern;

/**
 * Created by enes on 10/25/2017.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10+5 = "+context.executeStrategy(10,5));
        context = new Context(new OperationAdd());
        System.out.println("10-5 = "+context.executeStrategy(10,5));
        context = new Context(new OperationAdd());
        System.out.println("10*5 = "+context.executeStrategy(10,5));
    }
}
