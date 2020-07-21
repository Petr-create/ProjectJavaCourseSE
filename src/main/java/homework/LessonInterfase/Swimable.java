package homework.LessonInterfase;

public interface Swimable extends Walkable{
    void swim();
    double maxSwimSpeed();

    default void sayHello(){
        System.out.println(" my Hello Swimable");
    }
}
