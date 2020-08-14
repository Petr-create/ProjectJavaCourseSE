package homework.LinkedListkakWork;

public class MyLinkedList<T>{
    private Node<T> head;
    public MyLinkedList() {
    }

    public MyLinkedList(Node<T> head) {
        this.head = head;
    }


    public int size() {
        if (head == null) {
            return 0;
        }

        int size = 0;
        Node<T> node = head;
        while (node != null) {
            size++;
            node = node.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(T o) {
        if (head == null)
            return false;

        Node<T> curNod = head;
        if(curNod.getValue().equals(o)){
            return true;
        }
        while(curNod.getNext() != null){
            if (curNod.getNext().getValue().equals(o)) {
                return true;
            }
            curNod = curNod.getNext();
        }
        return false;
    }

    public boolean add(T o) {
        if(head == null){
            head = new Node<T>(o, null);
        }
        else {
            Node<T> curNod = head;
            while (curNod.getNext() != null){
                curNod = curNod.getNext();
            }
            curNod.setNext(new Node<T>(o, null));
        }
        return true;
    }

    public boolean remove(T o) {
        if (head != null) {
            Node<T> removeElementNode;
            removeElementNode = head;
            if (removeElementNode.getValue().equals(o)) {
                head = head.getNext();
            }
            else{
                Node<T> currentNode = head;
                while (currentNode.getNext() != null) {
                    if (currentNode.getNext().getValue().equals(o)) {
                        break;
                    }
                    currentNode = currentNode.getNext();
                }
                removeElementNode = currentNode.getNext();
                currentNode.setNext(currentNode.getNext().getNext());
                removeElementNode.setNext(null);
            }
        }
        return true;
    }

    public void clear() {
        if(head != null){
            head = null;
        }
    }

    public T get(int index) {
        if(isCorrectIndex(index)){
            Node<T> currentNode = head;
            int currentIndex = 0;
            while(currentIndex != index){
                currentIndex++;
                currentNode = currentNode.getNext();
            }
            return  currentNode.getValue();
        }
        return null;
    }

    public T set(int index, T element) {
        if (isCorrectIndex(index)) {
            Node<T> currentNode = head;
            int currentIndex = 0;
            while (currentIndex != index) {
                currentIndex++;
                currentNode = currentNode.getNext();
            }
            T el = currentNode.getValue();
            currentNode.setValue(element);
            return el;
        }
        throw new IndexOutOfBoundsException();
    }

    public void add(int index, T element) {
        if (isCorrectIndex(index)) {
            Node<T> curNod = head;
            Node<T> prev = head;
            int currentIndex = 0;
            if (index == 0) {
                head = new Node<T>(element, curNod);
            } else {
                while (currentIndex != index) {
                    currentIndex++;
                    prev = curNod;
                    curNod = curNod.getNext();
                }
                prev.setNext(new Node<T>(element, curNod.getNext()));
            }

        } else
            throw new IndexOutOfBoundsException();
    }

    public Node<T> remove(int index) {
        if(isCorrectIndex(index)){
            Node<T> removeElementNode;
            if (index == 0){
                removeElementNode = head;
                head = head.getNext();
            }
            else{
                Node<T> currentNode = head;
                int currentIndex = 0;
                while(currentIndex != index - 1){
                    currentIndex++;
                    currentNode = currentNode.getNext();
                }
                removeElementNode = currentNode.getNext();
                currentNode.setNext(currentNode.getNext().getNext());
                removeElementNode.setNext(null);

            }
            return removeElementNode;
        }
        throw new IndexOutOfBoundsException();
    }

    private boolean isCorrectIndex(int index){
        if(index >= 0 && index < size()){
            return true;
        }
        return false;
    }

    public int indexOf(T o) {
        if(head != null){
            Node<T> currentNode = head;
            int currentIndex = 0;
            while(currentNode != null){
                if(currentNode.getValue().equals(o)){
                    return currentIndex;
                }
                currentNode = currentNode.getNext();
                currentIndex++;
            }
        }
        return -1;
    }

    public int lastIndexOf(T o) {
        if(head != null){
            Node<T> currentNode = head;
            int currentIndex = 0;
            int index = 0;
            int i = 0;
            while(currentNode != null){
                if(currentNode.getValue().equals(o)){
                    ++i;
                    break;
                }
                currentNode = currentNode.getNext();
            }
            if(i == 0){
                return -1;
            }
            Node<T> curNod = head;
            while(curNod != null){

                if(curNod.getValue().equals(o)){
                    index = currentIndex;
                }
                curNod = curNod.getNext();
                currentIndex++;
            }
            return index;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyLinkedList{ ");

        if(head != null){
            Node<T> currNod = head;
            while (currNod.getNext() != null){
                stringBuilder.append(currNod.getValue()).append(", ");
                currNod = currNod.getNext();
            }
            stringBuilder.append(currNod.getValue());
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
