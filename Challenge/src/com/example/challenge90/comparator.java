package com.example.challenge90;

import java.util.*;

class comparator {
     public static void main(String[] args) {
         List<String> list= Arrays.asList("Bear","zebra","lion","Ant");//array got converted into list
         System.out.println(list);
         sortInDecending(list);//sorting of string done by alphabatically order
         System.out.println(list);


     }
     public static void sortInDecending(List<String> stringList){
        // Collections.sort(stringList);
        // Collections.reverse(stringList);
         Collections.sort(stringList, new Comparator<String>() {//by using custom comparator we can sort acc to our need but in case of above commented down things we can't sort acc to ours
             @Override
             public int compare(String s, String t1) {//if first string are equal then return 0 and if string 1 is greater then return 1,and if string one is smaller the return the -1
                 if(s.equals(t1)){
                     return 0;
                 }else if(s.charAt(0)<t1.charAt(0)){
                     return -1;
                 }else{
                     return 1;
                 }

             }
         });
     }
}
