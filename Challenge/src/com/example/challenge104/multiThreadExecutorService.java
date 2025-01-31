package com.example.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multiThreadExecutorService {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            for (int i = 0; i < 10; i++) {
                sleep task = new sleep();
                service.submit(task);

            }
            service.shutdown();
            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("emergency shutdown");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
