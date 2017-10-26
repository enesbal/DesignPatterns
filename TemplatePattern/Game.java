package TemplatePattern;

/**
 * Created by enes on 10/26/2017.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){
        initialize();

        startPlay();

        endPlay();
    }
}
