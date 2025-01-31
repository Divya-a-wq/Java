package com.example.challenge82;

public class arrayOperations {
    private int[] numbers;

    public arrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public  class Statistics {
        double mean() {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }

        double median() {
            return 0;
        }


    }

}
