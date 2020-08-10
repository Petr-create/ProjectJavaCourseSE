package LessonTest;

import homework.LessonTest.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void shouldCorrectConstructorName(){
        Book book = new Book("The Lord of the Rings", "Tolkunov", 800);
        assertEquals("The Lord of the Rings", book.getName());
    }
    @Test
    public void sholdCorrectConstructorAuthor(){
        Book book = new Book("The Lord of the Rings", "Tolkunov", 800);
        assertEquals("Tolkunov", book.getAuthor());
    }
    @Test
    public void shouldcorrectConstrPageCount(){
        Book book = new Book("The Lord of the Rings", "Tolkunov", 800);
        assertEquals(800, book.getPageCount(), "Вот так!!");
    }

}
