package homework.StreamsFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        String file1 = "src/main/resources/file1.txt";
        String file2 = "D:\\Java\\MiniJAVA\\ProjectJavaCourseSE\\src\\main\\resources\\file2.txt";

        createFiles(file1);
        createFiles(file2);

        writeSomeFile(file1);
        writeSomeFile(file2);

        List<String> list1 = readFile(file1);
        List<String> list2 = readFile(file2);

        writeFile(list1, file2);
        writeFile(list2, file1);
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
        count++;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile))){

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
        if( count == 2){
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



    public static List<String> readFile(String file) {
        List<String> listOfData = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String d;
            while((d = reader.readLine()) != null){
                listOfData.add(d);
            }
        }catch (IOException e){
            e.getStackTrace();
        }
        return listOfData;
    }

    public static void writeFile(List<String> list, String file){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for(String str: list){
                writer.write(str);
                writer.newLine();
            }
        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
