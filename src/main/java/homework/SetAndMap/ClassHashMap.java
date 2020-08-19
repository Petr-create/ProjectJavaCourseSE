package homework.SetAndMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ClassHashMap {
    public static void main(String[] args) {
        Map<Man, Fruit> map = new HashMap<>();

        Man man1 = new Man("Сидоров", 20);
        Man man2 = new Man("Петров", 25);
        Man man3 = new Man("Непомнящий", 30);

        Fruit fruit1 = new Fruit("Lemon", 2);
        Fruit fruit2 = new Fruit("Apple", 1);
        Fruit fruit3 = new Fruit("Watermelon", 3);

        map.put(man1, fruit1);
        map.put(man2, fruit2);
        map.put(man3, fruit3);

        System.out.println("map.get(man1) = " + map.get(man1));

        Fruit fruit4 = new Fruit("Grapes", 21);
        map.put(man2, fruit4);

        System.out.println("map.get(man2) = " + map.get(man2));

        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Man key = pair.getKey();
            Fruit value = pair.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println();

        for(Man key : map.keySet()){
            System.out.println("key: " + key + " - " + map.get(key));
        }

        System.out.println();

        Set<Man> set = map.keySet();
        Iterator<Man> itr = set.iterator();
        while (itr.hasNext()){
            Man key = itr.next();
            Fruit value = map.get(key);
            System.out.println("key: " + key + " - " + value);
        }

        System.out.println();

        Map<Man, Fruit> map1 = new HashMap<>(map);
        for(Map.Entry<Man, Fruit> pair : map1.entrySet()){
            Man key = pair.getKey();
            Fruit value = pair.getValue();
            System.out.println(key + " : " + value);
        }

        Map<Man, Fruit> map3 = new HashMap<>(map);
        Fruit fruit5 = new Fruit("Pear", 34);
        Fruit fruit6 = new Fruit("Apricot", 51);

        Man man5 = new Man("Пушкин", 30);
        Man man6 = new Man("Сушкин", 33);

        map3.put(man5, fruit5);
        map3.put(man6, fruit6);

        System.out.println();

        map.putAll(map3);
        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Man key = pair.getKey();
            Fruit value = pair.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println();
        System.out.println("map.remove(\"Сушкин\") = " + map.remove(man5));
        System.out.println();
        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Man key = pair.getKey();
            Fruit value = pair.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println();
        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Man key = pair.getKey();
            String k = key.getName();
            Fruit value = pair.getValue();
            String v = value.getName();
            if(v.equals("Lemon")) {
                System.out.println("Фрукт " + v + " взял " + k);
            }
        }

        System.out.println();
        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Man key = pair.getKey();
            String k = key.getName();
            Fruit value = pair.getValue();
            String v = value.getName();
            System.out.println(k + " : " + v);
        }

        System.out.println();
        char[] chars;
        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Man key = pair.getKey();
            String k = key.getName();
            chars = k.toCharArray();
            if(chars.length > 6){
                System.out.print(k + " ");
            }
        }

        System.out.println();
        System.out.println();
        Man man7 = new Man("Кукушкин", 97);
        map.put(man5, fruit3);
        map.put(man2, fruit2);
        map.put(man7, fruit3);

        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Man key = pair.getKey();
            Fruit value = pair.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();
        int count = 1;
        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Fruit value = pair.getValue();
            String v = value.getName();
            if(v.equals(fruit3.getName())){
                if(count > 2) {
                    System.out.println(v);
                }
                count++;
                continue;
            }
            System.out.println(v);
        }

        System.out.println();
        Man man8 = new Man("Череззаборногузадерищинский", 21);
        map.put(man8, fruit2);
        count = 1;
        for(Map.Entry<Man, Fruit> pair : map.entrySet()){
            Fruit value = pair.getValue();
            String v = value.getName();
            char x = v.charAt(0);
            if(x == 'A'){
                if(count > 2) {
                    System.out.println(v);
                }
                count++;
                continue;
            }
            System.out.println(v);
        }
        System.out.println();

        Fruit fruit = arbuzReturn(map);
        System.out.println("fruit.getName() = " + fruit.getName());

        System.out.println();

        Map<Integer, Fruit> opa = newMapReturn(map);
        for(Map.Entry<Integer, Fruit> pair : opa.entrySet()){
            Integer key = pair.getKey();
            Fruit value = pair.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println();
        double sum = 0;
        int countt = 0;
        for (Map.Entry<Integer, Fruit> pair : opa.entrySet()) {
            Fruit value = pair.getValue();
            Integer v = value.getWeight();
            sum += v;
            countt++;
        }
        System.out.printf( "%.2f", sum / countt);

    }

    public static Fruit arbuzReturn(Map<Man, Fruit> map) {
        for (Map.Entry<Man, Fruit> pair : map.entrySet()) {
            Fruit value = pair.getValue();
            String v = value.getName();
            if (v.equals("Watermelon") || v.equals("watermelon") || v.equals("WATERmelon")) {
                return value;
            }
        }
        return null;
    }

    public static Map<Integer, Fruit> newMapReturn(Map<Man, Fruit> map){
        Map<Integer, Fruit> newmap = new HashMap<>();
        Integer n = 1;
        for (Map.Entry<Man, Fruit> pair : map.entrySet()) {
            Fruit value = pair.getValue();
            newmap.put(n, value);
            n++;
        }
        return newmap;
    }
}
