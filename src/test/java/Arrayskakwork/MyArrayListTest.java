package Arrayskakwork;

import homework.Arrayskakwork.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс MyArrayLis: ")
public class MyArrayListTest {
    @Test
    @DisplayName("правильно добавляет элемент")
    public void shouldCorrectAddElement(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        Assertions.assertEquals("Element1", list.get(0));
    }

    @Test
    @DisplayName("правильно определяет размер списка")
    public void shouldCorrectCountSizeArray(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        Assertions.assertEquals(2, list.size());
    }

    @Test
    @DisplayName("правильно определяет пустой список")
    public void shouldCorrectCountZeroList(){
        MyArrayList list = new MyArrayList();
        Assertions.assertEquals(true, list.isEmpty());
    }

    @Test
    @DisplayName("правильно определяет наличие элемента в списке")
    public void shouldCorrectFindElementArray(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        Assertions.assertEquals(true, list.contains("Element2"));
        Assertions.assertEquals(false, list.contains("Element3"));
    }

    @Test
    @DisplayName("добавляет элементы в список")
    public void shouldCorrectAddElementToArray(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");
        list.add("Element5");
        list.add("Element6");
        list.add("Element7");
        list.add("Element8");
        list.add("Element9");
        list.add("Element10");
        list.add("Element11");
        Assertions.assertEquals(11, list.size());
    }

    @Test
    @DisplayName("правильно удаляет элемент из списка по значению")
    public void shouldCorrectRemoveElementFromArrayForValue(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");
        Assertions.assertEquals(true, list.remove("Element3"));
        Assertions.assertEquals(3, list.size());
        Assertions.assertEquals(false, list.contains("Element3"));
        Assertions.assertEquals(false, list.remove("Element3"));
    }

    @Test
    @DisplayName("удаляет все элементы из списка")
    public void shouldCorrectRemoveAllelementfromArrayList(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");
        list.clear();
        Assertions.assertEquals(0, list.size());
    }

    @Test
    @DisplayName("устанавливает значение элеменнта списка по индексу")
    public void shouldCorrectValueForIndex(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add(2,"Element4");
        Assertions.assertEquals("Element4", list.get(2));
        Assertions.assertEquals(4, list.size());
    }

    @Test
    @DisplayName("меняет значение элемента списка по индексу")
    public void shouldChangElementArrayListForindex(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.set(1, "OPA");
        Assertions.assertEquals("OPA", list.get(1));
        Assertions.assertEquals(3, list.size());
    }

    @Test
    @DisplayName("удаляет элемент по индексу")
    public void shouldRemoveElementForIndex(){
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.remove(1);
        Assertions.assertEquals("Element3", list.get(1));
        Assertions.assertEquals(2, list.size());
    }

    @Test
    @DisplayName("возвращает индекс по значению элемента")
    public void shouldCorrectReturnIndexForValue() {
        MyArrayList list = new MyArrayList();
        list.add("Element1");
        list.add("Element2");
        list.add("Element2");
        Assertions.assertEquals(1, list.indexOf("Element2"));
    }
}
