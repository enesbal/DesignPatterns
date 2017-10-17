package CompositePattern;

/**
 * Created by enes on 10/17/2017.
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales",20000);

        Employee headMarketing = new Employee("Michael", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 1000);
        Employee clerk2 = new Employee("Bob","Sales",10000);

        Employee salesExecutive1 = new Employee("Richard","Sales",10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);

        for(Employee headEmployeee : CEO.getSubordinates()){
            System.out.println(headEmployeee);

            for(Employee employee : headEmployeee.getSubordinates()){
                System.out.println(employee);
            }
        }
    }
}
