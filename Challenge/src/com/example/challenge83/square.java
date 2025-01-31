package com.example.challenge83;

public class square extends shape{
    private final double sideIncm;

    public square(double sideIncm) {
        this.sideIncm = sideIncm;
    }

    public double getSideIncm() {
        return sideIncm;
    }

    @Override
    public double calculateArea() {
        return sideIncm*sideIncm;
    }
}
