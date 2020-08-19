package homework.SetAndMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Lemon", 2);
        Fruit fruit2 = new Fruit("Apple", 1);
        Fruit fruit3 = new Fruit("Watermelon", 3);
        Fruit fruit4 = new Fruit("Melon", 10);
        Fruit fruit5 = new Fruit("Plum", 5);
        Fruit fruit6 = new Fruit("Peach", 17);

        Set<Fruit> sethash = new HashSet<>();
        sethash.add(fruit1);
        sethash.add(fruit2);
        sethash.add(fruit3);
        sethash.add(fruit4);
        sethash.add(fruit5);
        sethash.add(fruit6);

        System.out.println("sethash = " + sethash);

        sethash.add(fruit2);
        sethash.add(fruit2);

        System.out.println("sethash = " + sethash);

        sethash.remove(fruit3);
        System.out.println("sethash = " + sethash);

        Iterator<Fruit> fruitIterator = sethash.iterator();
        while(fruitIterator.hasNext()){
            Fruit fruit = fruitIterator.next();
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.println();

        Set<Fruit> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(fruit1);
        linkedhashset.add(fruit2);
        linkedhashset.add(fruit3);
        linkedhashset.add(fruit4);
        linkedhashset.add(fruit5);
        linkedhashset.add(fruit6);

        System.out.println("linkedhashset = " + linkedhashset);

        linkedhashset.add(fruit2);
        linkedhashset.add(fruit2);

        System.out.println("linkedhashset = " + linkedhashset);

        linkedhashset.remove(fruit3);
        System.out.println("linkedhashset = " + linkedhashset);

        Iterator<Fruit> linkedhashsetIterator = linkedhashset.iterator();
        while (linkedhashsetIterator.hasNext()){
            Fruit fruit = linkedhashsetIterator.next();
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.println();

        Set<Fruit> treeset = new TreeSet<>();
        treeset.add(fruit1);
        treeset.add(fruit2);
        treeset.add(fruit3);
        treeset.add(fruit4);
        treeset.add(fruit5);
        treeset.add(fruit6);

        System.out.println("treeset = " + treeset);

        treeset.add(fruit2);
        treeset.add(fruit2);

        System.out.println("treeset = " + treeset);

        treeset.remove(fruit3);

        System.out.println("treeset = " + treeset);

        Iterator<Fruit> treesetIterator = treeset.iterator();
        while (treesetIterator.hasNext()){
            Fruit fruit = treesetIterator.next();
            System.out.print(fruit + " ");
        }
    }
}
