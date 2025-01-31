package in.div;

import in.div.Default;

public class accessTest {
    public static void main(String[] args) {
        // Create a Car object using the default constructor
        Car car = new Car();
        car.color = "red";
        car.model = "swift";
        car.costOfPurchase=50000;// default ko same package ki dusri class me use kar sakte hain
        System.out.println(car);

        // Create a Car object using the parameterized constructor
        Car newCar = new  Car("blue","thar",70.5,30000);
        System.out.println(newCar);
        Default def=new Default();
    }
}



