package in.div.inheritence;

import in.divs.twoWheeler;

public class inheritencetest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
        twoWheeler TwoWheeler =new twoWheeler();
        TwoWheeler.commute();
        TwoWheeler.balance();
        motorCycle motar=new motorCycle();
        motar.commute();
        motar.balance();
        motar.start();

    }
}
