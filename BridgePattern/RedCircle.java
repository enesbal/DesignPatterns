package BridgePattern;

/**
 * Created by enes on 10/15/2017.
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color :red,radius: "+ radius + ", x: "+ x+", "+y+"]");
    }
}
