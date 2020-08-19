package homework.SetAndMap;

public class Fruit implements Comparable<Fruit>{
    private final String name;
    private int weight;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return weight - o.weight;
    }
}
