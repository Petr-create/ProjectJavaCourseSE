package homework.LinkedListkakWork;

import java.util.LinkedList;

public class RunnerMyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> listString = new LinkedList<>();
        listString.add("строка1");
        listString.add("строка2");
        listString.add("строка3");
        listString.add("строка1");
        listString.add("строка1");
        System.out.println("listString = " + listString.toString());
        System.out.println("listString.indexOf(\"строка5\") = " + listString.indexOf("строка5"));
        System.out.println("listString.lastIndexOf(\"строка7\") = " + listString.lastIndexOf("строка7"));


        System.out.println();
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Строка1");
        list.add("Строка2");
        list.add("Строка3");
        list.add("Строка2");
//        System.out.println("list = " + list);
//        list.add(2, "Строка10");
//        System.out.println("list = " + list);
//        System.out.println("list.indexOf(\"Строка1\") = " + list.indexOf("Строка1"));
        System.out.println("list.lastIndexOf(\"Строка5\") = " + list.lastIndexOf("Строка2"));

    }
}
