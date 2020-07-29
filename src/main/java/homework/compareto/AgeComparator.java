package homework.compareto;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        Integer age1 = new Integer(o1.getAge());
        Integer age2 = new Integer(o2.getAge());

        return age1.compareTo(age2);
    }
}
