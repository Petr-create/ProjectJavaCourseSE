package homework.LinkedListkakWorkDoublyConnected;

public class MyLinkedList<T> {
    private Node<T> fstNode;
    private Node<T> lstNode;

    public boolean isEmpty(){
        return fstNode == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int size = 0;
        Node<T> cur = fstNode;
        while (cur != null) {
            size++;
            cur = cur.getNext();
        }
        return size;
    }

    private boolean isCorrectIndex(int index){
        if(index >= 0 && index <= size()){
            return true;
        }
        return false;
    }

    public void addFirst(T o){
        Node temp = new Node(o);
        if(isEmpty()){
            lstNode = temp;
        }
        else {
            fstNode.setPrev(temp);
        }
        temp.setNext(fstNode);
        fstNode = temp;
    }

    public void addLast(T o){
        Node temp = new Node(o);
        if(isEmpty()){
            fstNode = temp;
        }
        else {
            lstNode.setNext(temp);
        }
        temp.setPrev(lstNode);
        lstNode = temp;
    }

    public void addLast1(T o){
        Node<T> temp = new Node<>(o);
        if(isEmpty()){
            fstNode = temp;
            temp.setPrev(lstNode);
            lstNode = temp;
        }
        else {
            lstNode.getPrev().setNext(temp);
            temp.setPrev(lstNode.getPrev());
            lstNode.setPrev(temp);
            temp.setNext(lstNode);
        }

    }

    public boolean add(T o){
        addLast(o);
        return true;
    }

    public void add(int index, T o){
        if (isCorrectIndex(index)){
            if(index == 0){
                addFirst(o);
            }
            else if(index == size()){
                addLast(o);
            }
            else {
                Node<T> cur = fstNode;
                int i = 0;
                while (i != index) {
                    cur = cur.getNext();
                    i++;
                }
                Node<T> temp = new Node<>(o);

                cur.getPrev().setNext(temp);
                temp.setPrev(cur.getPrev());
                cur.setPrev(temp);
                temp.setNext(cur);
            }
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean contains(T o) {
        if(size() != 0) {

            if (size() < 5) {
                Node<T> cur = fstNode;
                if (cur.getValue().equals(o)) {
                    return true;
                }
                while (cur.getNext() != null) {
                    if (cur.getNext().getValue().equals(o)) {
                        return true;
                    }
                    cur = cur.getNext();
                }
            } else {
                int i = 0;
                int middle = size() % 2;

                Node<T> cur1 = fstNode;
                Node<T> cur2 = lstNode;
                while (i <= middle) {
                    if (cur1.getValue().equals(o)) {
                        return true;
                    }
                    cur1 = cur1.getNext();
                    i++;
                }
                int j = size() - 1;
                while (j > middle) {
                    if (cur2.getValue().equals(o)) {
                        return true;
                    }
                    cur2 = cur2.getPrev();
                    i++;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LinkedList{");

        if(!isEmpty()){
            Node<T> currNod = fstNode;
            while (currNod.getNext() != null){
                stringBuilder.append(currNod.getValue()).append(", ");
                currNod = currNod.getNext();
            }
            stringBuilder.append(currNod.getValue());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
