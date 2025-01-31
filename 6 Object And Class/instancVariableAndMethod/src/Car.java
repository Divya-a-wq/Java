public class Car {

    int noOfWheels;//instances attribute or properties or variable

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;
    //default constructor
    public void drive(){//instance method
        System.out.println("car is driving");
        currentFuelInLiters--;
    }
    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }
    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }

}