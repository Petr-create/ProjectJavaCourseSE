package homework.Arrayskakwork;

import java.util.ArrayList;

public class MyArrayListRunner {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("arrayList.isEmpty() = " + arrayList.isEmpty());
        arrayList.add("строка1");
        arrayList.add("строка2");
        arrayList.add("строка4");
        System.out.println("arrayList.get(1) = " + arrayList.get(4));

    }
}
