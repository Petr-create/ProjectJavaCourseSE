package homework.LessonInterfase;

public interface Walkable {
    void walk();

    default void sayHello() {
        System.out.println("Hello Walkable");
    }

}
