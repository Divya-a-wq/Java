package com.example.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadService {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {//try block prevent shutdown
            printNumber task=new printNumber();
            service.submit(task);
        }

    }
}
