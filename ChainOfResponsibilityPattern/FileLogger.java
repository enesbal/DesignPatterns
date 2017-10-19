package ChainOfResponsibilityPattern;

/**
 * Created by enes on 10/19/2017.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message );
    }
}
