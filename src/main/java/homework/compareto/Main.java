package homework.compareto;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person personAge1 = new Person("Маша", "Толстая", 40);
        Person personAge2 = new Person("Саша", "Жирный", 20);

        int number = personAge1.compareTo(personAge2);
        //важно понимать на какой ссылке вызывается compareTo и какая  ссылка передается
        //если поменять местами результат будет совсем другой !!!

        if(number > 0 && number != 100)
            System.out.println("Саша младше Маши " + number);
        else if(number < 0)
            System.out.println("Саша старше Маши " + number);
        else if(number == 100)
            System.out.println("имя и фамилия совпадают " + number);
        else
            System.out.println("Саша и Маша одного года " + number);
        //-------------------------------------------------------------------------------

        int x = personAge1.getName().compareTo(personAge2.getName());
        System.out.println(x); // - мс

        Person personAge3 = new Person("Аша", "Воттак", 5);
        int y = personAge1.getName().compareTo(personAge3.getName());
        System.out.println(y); // + ам

        Person personAge4 = new Person("Маш", "Тол", 12);
        int z = personAge1.getName().compareTo(personAge4.getName());
        System.out.println(z); // + маш маша

        //------------------------------------------------------------------------------

        Person[] people = new Person[4];
        people[0] = personAge1;
        people[1] = personAge2;
        people[2] = personAge3;
        people[3] = personAge4;

        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

        try {
            Person peopleClone = (Person)personAge1.clone();
            System.out.println(peopleClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println();
        for(Person person : people)
            System.out.println(person);

        List<Person> list = new ArrayList<>();
        list.add(personAge1);
        list.add(personAge2);
        list.add(personAge3);
        list.add(personAge4);

        System.out.println();
        for(Person person : list)
            System.out.print(person + ", ");

        Collections.sort(list, new NameComparator());

        System.out.println();
        for(Person person : list)
            System.out.print(person + ", ");

        Collections.sort(list, new AgeComparator());

        System.out.println();
        for(Person person : list)
            System.out.print(person + ", ");

        Person[] p = {
                personAge3,
                personAge1,
                personAge4,
                personAge2
        };

        System.out.println();
        System.out.println();
        for(Person person : p)
            System.out.print(person + ", ");

        Arrays.sort(p);
        System.out.println();
        for(Person person : p)
            System.out.print(person + ", ");

    }

}
