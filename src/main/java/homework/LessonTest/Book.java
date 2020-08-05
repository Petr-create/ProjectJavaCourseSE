package homework.LessonTest;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {

    private final String name;
    private final String author;
    private int pageCount;

}
