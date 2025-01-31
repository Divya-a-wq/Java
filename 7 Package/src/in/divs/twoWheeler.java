package in.divs;

import in.div.inheritence.Vehicle;

public class twoWheeler extends Vehicle {
    public twoWheeler(){
        setNoOfTyre(2);
        noOfTyre=2;
    }
    public void balance(){
        System.out.println("I am balancing on two tyres");
    }

}
