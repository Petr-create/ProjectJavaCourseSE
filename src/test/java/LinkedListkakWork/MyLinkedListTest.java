package LinkedListkakWork;

import homework.LinkedListkakWork.MyLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyLinkedList: ")
public class MyLinkedListTest {
    private static final String ELEMENT = "Element";

    @Test
    @DisplayName("корректно добавляет элемент")
    public void shouldCorrectAddElement(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(ELEMENT);
        assertEquals(1, myLinkedList.size());
        assertEquals(ELEMENT, myLinkedList.get(0));
    }

    @Test
    @DisplayName("правильно определяет размер списка")
    public void shouldCorrectDefineSize(){
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(0, myLinkedList.size());
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        assertEquals(3, myLinkedList.size());
    }

    @Test
    @DisplayName("определяет пустой список или нет")
    public void shouldCorrectEmptyOrNotList(){
        MyLinkedList myLinkedList = new MyLinkedList();
        assertEquals(true, myLinkedList.isEmpty());
        myLinkedList.add("Строка1");
        assertEquals(false, myLinkedList.isEmpty());
    }

    @Test
    @DisplayName("правильно определяет наличие элемента в списке")
    public void shouldCorrectDefineElementList(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        assertEquals(true, myLinkedList.contains("Строка1"));
        assertEquals(true, myLinkedList.contains("Строка2"));
        assertEquals(true, myLinkedList.contains("Строка3"));
        assertEquals(false, myLinkedList.contains("Строка4"));
    }

    @Test
    @DisplayName("правильно удаляет элемент по значению")
    public void shouldCorrectRemoveElementForValue(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        myLinkedList.remove("Строка1");
        assertEquals(2, myLinkedList.size());
        assertEquals("Строка2", myLinkedList.get(0));
    }

    @Test
    @DisplayName("удаляет все элементы")
    public void shouldRemoveAllElements(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }

    @Test
    @DisplayName("получает элемент по индексу")
    public void shouldGetElementForIndex(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        assertEquals("Строка1", myLinkedList.get(0));
        assertEquals("Строка2", myLinkedList.get(1));
        assertEquals("Строка3", myLinkedList.get(2));
    }

    @Test
    @DisplayName("вставляет элемет по индексу")
    public void shouldSetElementForIndex(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        myLinkedList.set(0, "Строка10");
        assertEquals("Строка10", myLinkedList.get(0));
        myLinkedList.set(1, "Строка20");
        assertEquals("Строка20", myLinkedList.get(1));
        myLinkedList.set(2, "Строка30");
        assertEquals("Строка30", myLinkedList.get(2));
    }

    @Test
    @DisplayName("добавляет элемент по индексу")
    public void shouldAddElementForIndex(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        myLinkedList.add(0, "Строка10");
        assertEquals("Строка10", myLinkedList.get(0));
        assertEquals("Строка1", myLinkedList.get(1));
    }

    @Test
    @DisplayName("удаляет элемент из списка по индексу")
    public void shouldRemoveElementForIndex(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        myLinkedList.remove(1);
        assertEquals(2, myLinkedList.size());
    }

    @Test
    @DisplayName("находит индекс первого элемента по значению")
    public void shouldSearchIndexForElementFirst(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        myLinkedList.add("Строка2");
        assertEquals(0, myLinkedList.indexOf("Строка1"));
        assertEquals(1, myLinkedList.indexOf("Строка2"));
    }

    @Test
    @DisplayName("находит индекс последнего элемента по значению")
    public void shouldSearchIndexForElementLast(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Строка1");
        myLinkedList.add("Строка2");
        myLinkedList.add("Строка3");
        myLinkedList.add("Строка2");
        assertEquals(3, myLinkedList.lastIndexOf("Строка2"));
        assertEquals(2, myLinkedList.lastIndexOf("Строка3"));
        assertEquals(-1, myLinkedList.lastIndexOf("Строка10"));
    }
}
