package com.example.challenge104;

public class sleep implements Runnable {
    @Override
    public void run() {
       Thread current =Thread.currentThread();
        System.out.printf("started with Thread : %s\n",current.getName());
        try {
            Thread.sleep(getRandom()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("ended with Thread: %s\n",current.getName());
    }
    private int getRandom(){
        double random=Math.random()*5+1;
        return (int) random;
    }
}

