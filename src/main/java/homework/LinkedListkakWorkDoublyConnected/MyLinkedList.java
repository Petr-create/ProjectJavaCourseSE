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

    private void addFirst(T o){
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

    private void addLast(T o){
        Node temp = new Node(o);
        if(isEmpty()){
            fstNode = temp;
        }
        else {
            lstNode.setNext(temp);
            temp.setPrev(lstNode);
        }
        lstNode = temp;
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

                temp.setPrev(cur.getPrev());
                cur.getPrev().setNext(temp);
                temp.setNext(cur);
                cur.setPrev(temp);

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
                int middle = size() / 2;

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
                    j--;
                }
            }
        }
        return false;
    }

    private Node<T> removeFirst(){
        Node<T> cur = fstNode;
        if(fstNode.getNext() == null){
            lstNode = null;
        }
        else{
            fstNode.getNext().setPrev(null);
        }
        fstNode = fstNode.getNext();
        return cur;
    }

    private Node<T> removeLast(){
        Node<T> cur = lstNode;
        if(fstNode.getNext() == null){
            fstNode = null;
        }
        else{
            lstNode.getPrev().setNext(null);
        }
        lstNode = lstNode.getPrev();
        return cur;
    }

    public boolean remove(T o) {
        if(!isEmpty()){
            Node<T> cur = fstNode;
            if(cur.getValue().equals(o)){
                removeFirst();
                return true;
            }
            cur = lstNode;
            if(cur.getValue().equals(o)){
                removeLast();
                return true;
            }
            cur = fstNode;
            while(cur.getNext() != null){
                if(cur.getValue().equals(o)) {
                    cur.getPrev().setNext(cur.getNext());
                    cur.getNext().setPrev(cur.getPrev());
                    return true;
                }
                cur = cur.getNext();
            }
        }

        return false;
    }

    public Node<T> remove1(int index) {
        if(isCorrectIndex(index)){
            Node<T> curFirst = fstNode;
            Node<T> curLast = lstNode;
            int i = 0;
            int j = size() - 1;
            while(i < j) {
                if (i == index) {
                    if(i == 0){
                        removeFirst();
                        return curFirst;
                    }
                    curFirst.getPrev().setNext(curFirst.getNext());
                    curFirst.getNext().setPrev(curFirst.getPrev());
                    return curFirst;
                }
                if (j == index) {
                    if(j == size() - 1){
                        removeLast();
                        return curLast;
                    }
                    curLast.getPrev().setNext(curLast.getNext());
                    curLast.getNext().setPrev(curLast.getPrev());
                    return curLast;
                }
                curFirst = curFirst.getNext();
                curLast = curLast.getPrev();
                j--;
                i++;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public Node<T> remove(int index){
        if(isCorrectIndex(index)){
            Node<T> curFirst = fstNode;
            Node<T> curLast = lstNode;
            int x = size() / 2;
            if(index < x){
                int i = 0;
                if(index == 0){
                    removeFirst();
                    return curFirst;
                }
                while (i < x){
                    if(i == index){
                        curFirst.getPrev().setNext(curFirst.getNext());
                        curFirst.getNext().setPrev(curFirst.getPrev());
                        return curFirst;
                    }
                    curFirst = curFirst.getNext();
                    i++;
                }
            }
            else{
                int i = size() - 1;
                if(index == size() - 1){
                    removeLast();
                    return curLast;
                }
                while (i >= x){
                    if(i == index){
                        curLast.getPrev().setNext(curLast.getNext());
                        curLast.getNext().setPrev(curLast.getPrev());
                        return curLast;
                    }
                    curLast = curLast.getPrev();
                    i--;
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public void clear() {
        if(!isEmpty()){
            lstNode = null;
            fstNode = null;
        }
    }


    public T get(int index) {
        if(isCorrectIndex(index)){
            Node<T> curFirst = fstNode;
            Node<T> curLast = lstNode;
            int i = 0;
            int j = size() - 1;
            while(i < j){
                if(i == index){
                    return curFirst.getValue();
                }
                if(j == index){
                    return curLast.getValue();
                }
                curFirst = curFirst.getNext();
                curLast = curLast.getPrev();
                j--;
                i++;
            }

        }
        return null;
    }

    public T set(int index, T element) {
        if (isCorrectIndex(index)) {
            Node<T> curFirst = fstNode;
            Node<T> curLast = lstNode;
            int i = 0;
            int j = size() - 1;
            while (i < j) {
                if (i == index) {
                    T e = curFirst.getValue();
                    curFirst.setValue(element);
                    return e;
                }
                if (j == index) {
                    T e = curLast.getValue();
                    curLast.setValue(element);
                    return e;
                }
                curFirst = curFirst.getNext();
                curLast = curLast.getPrev();
                j--;
                i++;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public int indexOf(T o) {
        if(!isEmpty()){
            Node<T> cur = fstNode;
            int currentIndex = 0;
            while(cur != null){
                if(cur.getValue().equals(o)){
                    return currentIndex;
                }
                cur = cur.getNext();
                currentIndex++;
            }
        }
        return -1;
    }

    public int lastIndexOf(T o) {
        if(!isEmpty()){
            Node<T> currentNode = fstNode;
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
            Node<T> curNod = fstNode;
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
