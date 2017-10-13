package AbstractFactory;

/**
 * Created by enes on 10/14/2017.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
