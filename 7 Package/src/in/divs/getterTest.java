package in.divs;

import in.GetterAndSetter.Car;

public class getterTest {
    public static void main(String[] args) {


        Car car = new Car("red", "maruti", 3, 800000);
        car.setColor("Blue");
        System.out.printf("%s %s",car.getmodel(),car.getColor());
    }
}