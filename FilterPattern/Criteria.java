package FilterPattern;

import java.util.List;

/**
 * Created by enes on 10/16/2017.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person>  persons);
}
