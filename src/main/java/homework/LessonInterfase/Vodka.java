package homework.LessonInterfase;

public class Vodka {
    byte capacity;
    String brand;
    boolean real;
    int numberOfBottles;

    public Vodka(){

    }

    public Vodka(byte capacity) {
        this.capacity = capacity;
    }

    public Vodka(byte capacity, String brand) {
        this(capacity);
        this.brand = brand;
    }

    public Vodka(byte capacity, String brand, boolean real) {
        this(capacity, brand);
        this.real = real;
    }

    public Vodka(byte capacity, String brand, boolean real, int numberOfBottles) {
        this(capacity, brand, real);
        this.numberOfBottles = numberOfBottles;
    }

    void drinkToMach(boolean real, String brand){

    }
    void drinkToMach(boolean real){

    }
    void drinkToMach(String brand, boolean real){

    }
    void drinkToMach(int numberOfBottles){

    }
}
