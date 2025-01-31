package com.example.challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names=List.of("divya","kavya","riya");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
