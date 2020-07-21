package homework.LessonInterfase;

public class Bird implements Flyable, Runnable {
    @Override
    public void fly() {

    }

    @Override
    public String flyMaxDistance() {
        return null;
    }

    @Override
    public void run() {

    }

    @Override
    public int maxRunDistance() {
        return 0;
    }

    @Override
    public void sayHello() {
        System.out.println(" new Hello");
    }
}
