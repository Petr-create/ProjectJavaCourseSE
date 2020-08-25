package homework.StreamsFile;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String file1 = "src/main/resources/file1.txt";
        String file2 = "D:\\Java\\MiniJAVA\\ProjectJavaCourseSE\\src\\main\\resources\\file2.txt";

        createFiles(file1);
        createFiles(file2);

        writeSomeFile(file1);
        writeSomeFile(file2);
    }

    public static void createFiles(String nameFile){
        File file = new File(nameFile);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeSomeFile(String nameFile){
        try (BufferedWriter writer = new BufferedWriter(new PrintWriter(nameFile));
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String line1 = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();

            writer.write(line1);
            writer.newLine();
            writer.write(line2 + "\n");
            writer.write(line3 + "\n");

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
