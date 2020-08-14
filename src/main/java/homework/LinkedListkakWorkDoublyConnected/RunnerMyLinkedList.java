package homework.LinkedListkakWorkDoublyConnected;

public class RunnerMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("Строка1");
        list.addFirst("Строка2");
        list.addFirst("Строка3");
        list.addFirst("Строка4");
        list.addFirst("Строка5");
        list.addFirst("Строка6");


        System.out.println("list = " + list);
        //System.out.println("list.contains(\"Строка1\") = " + list.contains("Строка9"));
        list.addLast("Строка7");
        list.addLast("Строка8");
        list.addLast("Строка9");
        System.out.println("list = " + list);
    }
}
