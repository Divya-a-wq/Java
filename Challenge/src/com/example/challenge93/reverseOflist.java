package com.example.challenge93;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class reverseOflist {
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,5,6,3,4);
         System.out.println(list);
         reverse(list);
         System.out.println(list);

     }
     public static void reverse(List<Integer> list){
         //Collections.reverse(list);
         for (int i = 0; i < list.size()/2; i++) {
            swappingUsingSet.swap(list,i,list.size()-1-i);
         }

         }
     }


