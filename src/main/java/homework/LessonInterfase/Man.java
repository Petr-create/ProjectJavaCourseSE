package homework.LessonInterfase;

public class Man extends Person implements Runnable, Walkable, Swimable{
    @Override
    public int maxRunDistance() {
        return 0;
    }


    @Override
    public void swim() {

    }

    @Override
    public double maxSwimSpeed() {
        return 0;
    }

    @Override
    public void walk() {

    }

    @Override
    public void sayHello() {
        System.out.println("Hello Man");
    }
}
