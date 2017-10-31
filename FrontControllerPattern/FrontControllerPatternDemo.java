package FrontControllerPattern;

/**
 * Created by enes on 11/1/2017.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");

    }
}
