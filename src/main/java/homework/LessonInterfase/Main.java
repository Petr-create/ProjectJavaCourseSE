package homework.LessonInterfase;

public class Main {
    public static void main(String[] args) {
        Runnable run = new Man();
        run.sayHello();

        Runnable run1 = new Bird();
        run1.sayHello();

        Walkable walk = new Fish();
        walk.sayHello();
    }
}
