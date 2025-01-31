package in.file;

import java.io.FileReader;

import java.io.IOException;

public class reader{
    public static void main(String[] args) {
        String fileName = "divya-java.txt";

        try(FileReader reader = new FileReader(fileName)) {//trivage resource
            int read=0;
           do{
               read=reader.read();
               System.out.print((char)read);
           }while(read!=-1);
        } catch (IOException exception) {
            System.out.printf("exception occured :%s",exception.getMessage());
        }
    }
}