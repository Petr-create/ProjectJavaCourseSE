package homework.LinkedListkakWorkDoublyConnected;

public class RunnerMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Строка2");
        list.add("Строка4");
        list.add("Строка2");
        list.add("Строка4");
        System.out.println("list = " + list);
        System.out.println("list.lastIndexOf(\"Строка4\") = " + list.lastIndexOf("Строка2"));
    }
}
