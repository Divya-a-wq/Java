package com.example.challenge86;

public class Car extends vehicle{
    @Override
    public void service() {
        super.service();//parent vehicle ko ek baar call kiya hai
        System.out.println("acr is getting serviced...");//car ko call kiya hai
    }
}
