package com.example.challenge85;

public class calculator {
    public static void main(String[] args) {
        calculator cal=new calculator();
        System.out.println(add(2,3));
        System.out.println(add(23.4,12.5));
        System.out.println(add(12,34,23));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a,double b){
        return a+b;
    }

}
