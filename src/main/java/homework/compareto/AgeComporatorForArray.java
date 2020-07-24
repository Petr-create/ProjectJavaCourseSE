package homework.compareto;

import java.util.Comparator;

public class AgeComporatorForArray implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge() > o2.getAge())
            return 27;
        else if(o1.getAge() < o2.getAge())
            return -27;
        else
            return 0;
    }
}
