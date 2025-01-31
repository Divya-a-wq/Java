package com.example.challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class testingFactorial {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list= new ArrayList<>();
            for (int i = 0; i <=5; i++) {
                FactorialCalculator task=new FactorialCalculator(i);
                list.add(service.submit(task));

            }
            for (Future<Integer> Future : list) {
                System.out.printf("\n result is : %d",Future.get());
            }
            service.shutdown();
            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("bohot hua");
                service.shutdown();
            }
        } catch (InterruptedException |ExecutionException e) {
            throw new RuntimeException(e);
        }
        }
    }

