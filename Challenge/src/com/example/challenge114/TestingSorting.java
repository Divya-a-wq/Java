package com.example.challenge114;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<employee> employees=List.of(
                new employee("divya",20000),
                new employee("ayushi",21000),
                new employee("princy",24000),
                new employee("samkisha",13000)

        );
        employees.stream()
                .sorted((emp1,emp2) ->emp1.getSalary()-emp2.getSalary())
        .forEach(System.out::println);

    }
}
