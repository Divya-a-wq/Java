package com.example.challenge100;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        threadState t1=new threadState();
        System.out.printf("\ncreated the thread %s",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nthread finished %s",t1.getState());
    }
}
