package homework.Arrayskakwork;

import java.util.Arrays;

public class MyArrayList {
    public final static int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return realSize == 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if(array[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
//        if(realSize < array.length){
//            array[realSize++] = o;
////            realSize++;
//        }
//        else{
//            Object[] obj = new Object[array.length / 2 * 3 + 1];
//            System.arraycopy( array, 0,  obj, 0, array.length);
//            array = obj;
//            array[realSize++] = o;
//        }
        //Refactoring
        if(realSize >= array.length){
            Object[] obj = new Object[array.length / 2 * 3 + 1];
            System.arraycopy( array, 0,  obj, 0, array.length);
            array = obj;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        if(contains(o)){
            int index;
            for (index = 0; index < realSize; index++) {
                if(array[index].equals(o)){
                    break;
                }
            }
            for (int i = index; i < realSize - 1; i++) {
                array[i] = array[i+1];
            }
        }
        else {
            return false;
        }
        array[realSize - 1] = null;
        realSize--;
        return true;
    }

    public void clear() {
        Object[] obj = new Object[DEFAULT_CAPACITY];
        realSize = 0;
        array = obj;
    }

    private boolean isCorrectIndex(int index){
        return index >= realSize && index < 0;
    }

    public Object get(int index) {
        if(isCorrectIndex(index)){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public Object set(int index, Object element) {
        if(isCorrectIndex(index)){
            throw new IndexOutOfBoundsException();
        }
        return array[index] = element;
    }

    public void add(int index, Object element) {

        if (index == array.length - 1) {
            Object[] obj = new Object[array.length / 2 * 3 + 1];
            System.arraycopy(array, 0, obj, 0, array.length);
            array = obj;
        } else if (index < 0 || index >= realSize) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = realSize - 1; index <= i; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        realSize++;

    }

    public Object remove(int index) {
        if(!isCorrectIndex(index)){
            for (int i = index; i < realSize - 1; i++) {
                array[i] = array[i+1];
            }
        }
        else{
            throw new IndexOutOfBoundsException();
        }
        array[realSize - 1] = null;
        realSize--;
        return array[index];
    }

    public int indexOf(Object o) {

        for (int i = 0; i < realSize; i++) {
            if(array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
