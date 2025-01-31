package com.example.challenge91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class checkFrequencyByCollectionClass {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,3,8,7,7,4,2,8,2,2);
        System.out.println(Collections.frequency(list,1));//frequency means how many times a number occur in list
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,7));




    }
}
