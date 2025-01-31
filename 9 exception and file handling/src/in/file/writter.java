package in.file;

import java.io.FileWriter;
import java.io.IOException;

public class writter {
    public static void main(String[] args) {
        String fileName = "divya-java.txt";

        try(FileWriter writer = new FileWriter(fileName)) {//trivage resource
            writer.write("this is the best\n");
            for(int i=0;i<10;i++){
                writer.write('*');
            }
            writer.flush();
            System.out.println("file written successfully");
        } catch (IOException exception) {
            System.out.printf("eception occured %s\n", exception.getMessage());
        }
        }
    }


