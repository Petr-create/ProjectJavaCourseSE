package homework.LessonTest;

import homework.compareto.Person;

public class Main {
    public static void main(String[] args) {
        Person man1 = new Person("Ник", "Никнейм", 20);
        Person man2 = new Person("Ник", "Никнейм", 20);

        System.out.println(man1.equals(man2));
    }
}
