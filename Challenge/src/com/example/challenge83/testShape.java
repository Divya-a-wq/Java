package com.example.challenge83;

import java.util.Calendar;

public class testShape {
    public static void main(String[] args) {
       // shape shape=new shape() ;
        circle Cir=new circle(4);
        square sq=new square(12);
        System.out.printf("Area of circle is %4.2f",Cir.calculateArea());
        System.out.printf("\nArea of square is %4.2f",sq.calculateArea());

        }
    }

