package homework.LessonSerializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializable {
    public static void main(String[] args) {
        User user = new User("Vitaliy", "7777AB");
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream
                    (new FileOutputStream("src/main/resources/fileSerializable.bin"));
            out.writeObject(user);
            out.writeInt(User.number);
            out.writeChars(User.word);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
