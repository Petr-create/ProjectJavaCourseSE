package homework.StreamsFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterFile {
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        createFile();
        //fileWriter("D:\\Java\\MiniJAVA\\ProjectJavaCourseSE\\src\\main\\resources\\fileforwrite.txt");
    }

    public static void fileWriter(String file){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            String x;
            int count = 0;
            while(true){
               x = reader.readLine();
               if(x.equals("exit")){
                   break;
               }
               writer.write(x);
               writer.newLine();
               count++;

               if(count > 2){
                  break;
               }
            }
        }catch (IOException e){
            e.getStackTrace();
        }
        listArray(file);
    }

    public static void createFile(){
        String f = "src/main/resources/fileforwrite.txt";

            //String fileforwrite = reader.readLine();
            File file = new File(f);
            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        fileWriter(f);
    }

    public static void listArray(String file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String d;
            while((d = reader.readLine()) != null){
                list.add(d);
            }
        }catch (IOException e){
            e.getStackTrace();
        }
        deleterow(file);
    }

    public static void deleterow(String file){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            int i = 0;
            for(String str: list) {
                if (i != 0) {
                    writer.write(str);
                    writer.newLine();
                }
                i++;
            }
            list.clear();
        }catch (IOException e){
            e.getStackTrace();
        }
         addrow(file);
    }

    public static void addrow(String file){
        System.out.println("Введите еще строку: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = null;
        try {
            x = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(x.equals("exit")) {
                return;
        }
        addrow1(file, x);

    }

    public static void addrow1(String file, String x){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            writer.write(x);
            writer.newLine();
        }catch(IOException e){
            e.getStackTrace();
        }
        listArray(file);
    }
}
