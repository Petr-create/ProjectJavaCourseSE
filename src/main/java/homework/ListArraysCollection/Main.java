package homework.ListArraysCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //0. Содание списков: (Используя конструктор)
        List<Person> list = new ArrayList<>();
        List<Person> list2 = new ArrayList<>(20);

        list2.add(new Person("Николай", 25, true));
        list2.add(new Person("Николь", 49, false));
        list2.add(new Person("Алексей", 18, true));
        list2.add(new Person("Ник", 30, true));
        list2.add(new Person("Маша", 28, false));
        list2.add(1, new Person("Наиль", 50, true));
        System.out.println(list2);

        //1. Получить элемент по индексу:
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(50) + 1);
        }
        System.out.println(arrayList);
        System.out.println("Первый элемент списка: " + arrayList.get(0));
        System.out.println("Последний элемент списка: " + arrayList.get(19));

        //2. Задачи на вставку элемента:
        for (int i = 0; i < 5; i++) {
            arrayList.add(random.nextInt(50) + 1);
        }
        System.out.println(arrayList);
        arrayList.add(2, 100);
        arrayList.add(0, 200);
        Iterator<Integer> itr = arrayList.iterator();
        System.out.print("[");
        while (itr.hasNext()){
            Integer element = itr.next();
            System.out.print(element + ", ");
        }
        System.out.print("]\n");

        ArrayList<Integer> arrayList1 = new ArrayList<>(arrayList);
        System.out.println(arrayList1);
        arrayList1.set(0, 0);
        System.out.println(arrayList1);
        System.out.println();

        //3. Задачи на удаление элементов: (Используя методы)
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) == 100)
                arrayList.remove(i);
        }
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println();

        //4. Проверить наличие элемента
        Person p = new Person("Сергей", 24, true);
        list2.add(p);
        if(list2.contains(p))
            System.out.println(true);
        else
            System.out.println(false);
        System.out.println(list2.indexOf(p));
        if(list2.indexOf(p) != -1)
            System.out.println("Элемент содержится в списке list2");
        System.out.println();

        //5. Вывод списка:
        List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Apple"));
        fruits.add(new Fruits("Lemon"));
        fruits.add(new Fruits("Plum"));

        System.out.print("{");
        for (Fruits f : fruits) {
            if(fruits.indexOf(f) == fruits.size() - 1)
                System.out.print("\"" + f + "\"");
            else
                System.out.print("\"" + f + "\"; ");
        }
        System.out.println("}");
        System.out.println();

        //6. Отфильтровать список вернуть записи по некоторому условию:
        for(Person q : list2){
            if(list2.indexOf(q) % 3 == 0 && list2.indexOf(q) != 0)
                System.out.print(q);
        }

        System.out.println();
        for(Person d : list2){
            if(d.getName().equals("Николай"))
                System.out.println(d);
        }
        System.out.println();

        //7. Пропустить несколько первых элементов
        System.out.print(list2);
        System.out.println();
        for(Person q : list2){
            if(list2.indexOf(q) > 2)
                System.out.print(q);
        }
        System.out.println();

        //6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
        //а) Пропустить первые 2 элемента, которые равные "****"
        for (Person d : list2){
            if(!(d.getName().equals("Николай") || d.getName().equals("Наиль")))
                System.out.print(d);
        }
        System.out.println();

        //10. Создать класс Person.
        //Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н
        for (Person d : list2){
            if(d.getName().indexOf("Н") == 0 && d.getAge() >= 18 && d.getAge() <= 27 && d.isGenderMale())
                System.out.println(d);
        }
        System.out.println();

        //11. Найти средний возраст всех женщин.
        int sumAge = 0;
        int i = 0;
        for (Person d : list2) {
            if (!d.isGenderMale()) {
                sumAge += d.getAge();
                ++i;
            }
        }
        System.out.println(sumAge / i);
    }
}
