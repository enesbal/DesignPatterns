package BridgePattern;

/**
 * Created by enes on 10/15/2017.
 */
public abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }
    public abstract void draw();
}
