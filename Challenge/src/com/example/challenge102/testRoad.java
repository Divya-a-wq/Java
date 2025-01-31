package com.example.challenge102;

public class testRoad {
    public static void main(String[] args)throws InterruptedException {
        TraffivLightThread red=new TraffivLightThread(TrafficColor.RED);
        TraffivLightThread yellow=new TraffivLightThread(TrafficColor.YELLOW);
        TraffivLightThread green=new TraffivLightThread(TrafficColor.GREEN);
        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();

    }
}
