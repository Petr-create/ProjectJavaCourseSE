package homework.ListArraysCollection;

public class Person {
    private final String  name;
    private int age;
    private boolean genderMale;

    public Person(){
        name = null;
    }

    public Person(String name, int age, boolean genderMale){
        this.name = name;
        this.age = age;
        this.genderMale = genderMale;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genderMale=" + genderMale +
                "}";
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isGenderMale() {
        return this.genderMale;
    }
}
