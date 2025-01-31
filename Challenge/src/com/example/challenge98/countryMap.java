package com.example.challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class countryMap {
    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India","delhi");
        countryMap.put("pakistan","Islamabad");
        countryMap.put("Srilanka","colombo");
        countryMap.put("britain","england");
        countryMap.put("UK","londan");
        countryMap.put("china","Beijing");
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter country name:");
        String country=sc.next();
        if(countryMap.containsKey(country)){
            System.out.printf("capital of %s is %s",country,countryMap.get(country));

    }else{
            System.out.println("sorry we don't know the capital");
        }
}
}
