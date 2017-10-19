package ChainOfResponsibilityPattern;

/**
 * Created by enes on 10/19/2017.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger : " + message);
    }
}
