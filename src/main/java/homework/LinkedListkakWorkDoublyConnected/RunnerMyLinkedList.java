package homework.LinkedListkakWorkDoublyConnected;

public class RunnerMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Строка1");
        list.add("Строка2");
        list.add("Строка3");
        list.add("Строка4");
        System.out.println("list = " + list);
        System.out.println("list.remove(0) = " + list.remove(3));
        System.out.println("list = " + list);
    }
}
