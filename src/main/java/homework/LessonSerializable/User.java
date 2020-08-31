package homework.LessonSerializable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@AllArgsConstructor
@Data
public class User implements Serializable {
    public static final int number = 27;
    public static String word = "Ok";
    private String login;
    private transient String password;
}
