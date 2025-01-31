package com.example.challenge92;

import java.util.Arrays;
import java.util.List;

class swappingUsingSet {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,2,3,6,7);
        System.out.println(list);
        swap(list,2,5);//2 and 5 and index number
        System.out.println(list);

    }
    public static void swap(List<Integer> list,int x,int y){
        int swap=list.get(x);
list.set(x, list.get(y));
list.set(y, swap);
    }
}
