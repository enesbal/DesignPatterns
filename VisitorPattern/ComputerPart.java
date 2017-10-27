package VisitorPattern;

/**
 * Created by enes on 10/27/2017.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
