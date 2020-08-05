package homework.LessonTest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private final String name;
    private final String surname;
    private int age;

    @Override
    public String toString() {
        return "Person ( name=" + getName() + " surname=" + getSurname() + " age=" + getAge() + ")";
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return this.age == person.age;
    }

}
