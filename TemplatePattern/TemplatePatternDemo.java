package TemplatePattern;

/**
 * Created by enes on 10/26/2017.
 */
public class TemplatePatternDemo {
    public static void main(String[] args){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
