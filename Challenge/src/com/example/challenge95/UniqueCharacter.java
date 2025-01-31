package com.example.challenge95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter your string:");
        String userStr=sc.next();
        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }
        System.out.printf("your string has %d unique character  ",unique.size());
    }
}
