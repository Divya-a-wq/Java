package com.example.challenge83;

public class circle extends shape {
    private final double radius;
    public circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
