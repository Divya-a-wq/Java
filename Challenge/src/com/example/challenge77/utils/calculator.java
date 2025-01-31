package com.example.challenge77.utils;


import com.example.challenge77.geometry.circle;
import com.example.challenge77.geometry.rectangle;

public class calculator {
    public static void main(String[] args) {
        circle cr=new circle(12);
        rectangle rec= new rectangle(23,12);
       double crArea=Math.PI*Math.pow(cr.radius,2);
       double recArea=rec.breadth*rec.length;
        System.out.printf("Area of circle is: %f,area of rectangle is: %f",crArea,recArea);


    }
}
