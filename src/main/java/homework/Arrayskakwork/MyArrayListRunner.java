package homework.Arrayskakwork;

import java.util.ArrayList;

public class MyArrayListRunner {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("arrayList.isEmpty() = " + arrayList.isEmpty());
        arrayList.add("строка1");
        arrayList.add("строка2");
        arrayList.add("строка4");

        System.out.println("arrayList = " + arrayList);
        arrayList.remove(1);
        System.out.println("arrayList = " + arrayList);
//        arrayList.clear();
//        System.out.println("arrayList = " + arrayList);
        arrayList.set(1, "строка3");
        System.out.println("arrayList = " + arrayList);
        System.out.println("arrayList.size() = " + arrayList.size());
        arrayList.add(2, "строка100");
        System.out.println("arrayList = " + arrayList);
        System.out.println("arrayList.indexOf(\"строка100\") = " + arrayList.indexOf("строка100"));
        System.out.println("arrayList.indexOf(\"строка101\") = " + arrayList.indexOf("строка101"));

        System.out.println();
        MyArrayList myList = new MyArrayList();
        System.out.println("myList.isEmpty() = " + myList.isEmpty());
        System.out.println("myList = " + myList);
        myList.add("Строка1");
        myList.add("Строка2");
        myList.add("Строка3");
        System.out.println("myList.size() = " + myList.size());
        System.out.println("myList.get(2) = " + myList.get(2));

        System.out.println("myList = " + myList);
        myList.set(0, "Строка10");
        System.out.println("myList.get(0) = " + myList.get(0));
        myList.add("Строка100");
        System.out.println("myList = " + myList);
        myList.add(0, "опа");
        System.out.println("myList = " + myList);
        System.out.println("myList.indexOf(\"Строка100\") = " + myList.indexOf("Строка100"));
        myList.remove(2);
        System.out.println(myList);
        myList.clear();
        System.out.println("myList = " + myList);
    }
}
