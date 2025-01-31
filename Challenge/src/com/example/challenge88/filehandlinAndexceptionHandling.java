package com.example.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class filehandlinAndexceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your fileName:");
        String fileName = sc.next();
        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        }catch(FileNotFoundException e){
            System.out.printf("%s file not found exception",fileName);
        }


        catch (IOException e) {
            System.out.printf("exception occur :%s", e.getMessage());
        }
    }
}

