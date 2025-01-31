public class Car {

    int noOfWheels;//instances attribute or properties or variable

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;
    //    Car(){//default constructor
// noOfWheels=4;
// color="Black";
// maxSpeed=150;
// currentFuelInLiters=2;
// noOfSeats=5;
//    }
    Car(String color){
        //parameterized constructor
        noOfWheels=4;
        //object color
        this.color=color;//local variable color
        maxSpeed=150;
        currentFuelInLiters=2;
        noOfSeats=5;
    }
    public Car start(){
        if(currentFuelInLiters<=0){
            System.out.println("car is out of fuel,can not start");
        }else if(currentFuelInLiters<5){
            System.out.println("car is in reserved mode,please refuel");
        }else{
            System.out.println("car is started");
            currentFuelInLiters--;
        }
        return this;
    }
    public void drive(){//instance method

        currentFuelInLiters--;
        System.out.println("car is driving");
    }



    // public void addFuel(float fuel){
    //     currentFuelInLiters+=fuel;
    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters+=currentFuelInLiters;
    }
    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}
