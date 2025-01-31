package com.example.challenge97;

public class testenum {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n",day,day.getType());
        }
    }
}
