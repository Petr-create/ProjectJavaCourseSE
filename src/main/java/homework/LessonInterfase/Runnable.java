package homework.LessonInterfase;

public interface Runnable {
    void run();
    int maxRunDistance();
    default void sayHello(){
        System.out.println("Hello");
    }
}
