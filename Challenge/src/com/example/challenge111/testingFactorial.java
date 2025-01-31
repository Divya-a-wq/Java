package com.example.challenge111;

import java.util.stream.IntStream;

public class testingFactorial {
    public static void main(String[] args) {
        System.out.println("factoral using using two ways");
        int number=9;
        System.out.println("fact using structural");
        System.out.println(factorial(9));
        System.out.println("fact using functional");
        IntStream.rangeClosed(2,number)
                .reduce((a,b) ->a*b)
        .ifPresent(System.out::println);


    }
    public static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        int fact=1;
        for (int i = 2; i <=num; i++) {
            fact*=i;
        }
        return fact;
    }
}
