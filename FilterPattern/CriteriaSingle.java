package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enes on 10/16/2017.
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();

        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
