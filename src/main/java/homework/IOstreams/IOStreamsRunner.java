package homework.IOstreams;

import java.io.*;

public class IOStreamsRunner {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            System.out.println("input = " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file = new File("D:\\Java\\MiniJAVA\\ProjectJavaCourseSE\\src\\main\\resources\\file.txt");
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file);
            writer.println("Строка_1");
            writer.println("Строка_2");
            writer.println("Строка_3");
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            writer.close();
        }

        try(BufferedReader reader1 = new BufferedReader(new FileReader(file))){
            String in;
            while ((in = reader1.readLine()) != null){
                System.out.println("in = " + in);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
