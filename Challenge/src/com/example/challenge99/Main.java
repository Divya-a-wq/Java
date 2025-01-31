package com.example.challenge99;

public class Main {
    public static void main(String[] args) {
        hellothread t1=new hellothread(1);
        hellothread t2=new hellothread(2);

        t1.start();
        t2.start();

    }
}
