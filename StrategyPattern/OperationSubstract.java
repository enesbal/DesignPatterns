package StrategyPattern;

/**
 * Created by enes on 10/25/2017.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
