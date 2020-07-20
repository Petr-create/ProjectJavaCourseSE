package homework.erunda;

public class CatHouse {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion leo = new Lion();
        leo.sayMew();

        Cat bagira = new Panther();
        bagira.sayMew();

        DomesticCat domesticCat = new DomesticCat("murka", 3, true);
        domesticCat.getName();
    }
}
