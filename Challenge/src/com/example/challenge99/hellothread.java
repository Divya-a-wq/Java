package com.example.challenge99;

public class hellothread extends Thread{
    private final int threadnumber;

    public hellothread(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) %s hello from thread-%d\n",(i+1),Thread.currentThread(),threadnumber);
        }
    }
}
