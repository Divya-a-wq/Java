package com.example.challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs=List.of("my name is divya","nishad","ccrrently persuing","abcd","at bbd university");
      String result=  strs.stream()
                .filter(str ->str.length()>10)
                .reduce("",(a, b) ->a + " " + b);
        System.out.println(result);
    }
}
