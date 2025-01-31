package com.example.challenge101;

public class printThread extends Thread{
    private final int threadnumber;

    public printThread(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    @Override
    public void run() {
        System.out.printf(" %s Thread starting-%d\n",Thread.currentThread().getName(),threadnumber);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf(" %s Thread ended-%d\n",Thread.currentThread().getName(),threadnumber);
        }
    }

