package homework.compareto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person implements Comparable<Person>, Cloneable{
    private final String name;
    private final String surname;
    private int age;

    @Override
    public int compareTo(Person o) {
        if(surname.equals(o.surname))
            if(name.equals(o.name))
                return 100;
        //вот здесь я не уверен, сделал как понял задание
        //возможно имелось ввиду что-то другое
//        if(age > o.age)
//            return 27;
//        else if(age < o.age)
//            return -27;
//        else
//            return 0;
        return age - o.age;
        //Double.compare(age, o.age); //если age вдруг double
    }

    @Override
    public String toString() {
        return "Person ( name=" + getName() + " surname=" + getSurname() + " age=" + getAge() + ")";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
