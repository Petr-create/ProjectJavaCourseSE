package homework.LessonSerializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeseralizable {
    public static void main(String[] args) {
        try (
            ObjectInputStream in = new ObjectInputStream
                    (new FileInputStream("src/main/resources/fileSerializable.bin"))){
            User logAndPass = (User) in.readObject();
            int number = in.readInt();
            String word = in.readLine();
            System.out.println("logAndPass = " + logAndPass);
            System.out.println("number = " + number);
            System.out.println("word = " + word);
        } catch (IOException  | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
