package IteratorPattern;

/**
 * Created by enes on 10/21/2017.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
