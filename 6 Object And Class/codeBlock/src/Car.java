public class Car {
    static int noOfCarSold;
    int noOfWheels;//instances attribute or properties or variable

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    static{//pahli baar jab classs load ho rhi hai tb,bas ek baar call hoga pure code me
        noOfCarSold=0;
        System.out.println("i am in static block");
    }
    {
        noOfCarSold++;
        System.out.println("i am initialise block");// koi bhi constructor set hone se pahle ye run hota hai and har baar object ke sath call hoga again and again
    }
    Car(String color){
        //parameterized constructor
        noOfWheels=4;
        //object color
        this.color=color;//local variable color
        maxSpeed=150;
        currentFuelInLiters=2;
        noOfSeats=5;
    }
    Car(){//default constructor
        // noOfWheels=4;
        //  color="Black";
        //  maxSpeed=150;
        //  currentFuelInLiters=2;
        //  noOfSeats=5;
        this.color="Black";
    }
    public Car start(){
        if(currentFuelInLiters<=0){
            // int pop;
            System.out.println("car is out of fuel,can not start");
        }else if(currentFuelInLiters<5){
            System.out.println("car is in reserved mode,please refuel");
        }else{
            System.out.println("car is started");
            currentFuelInLiters--;
        }
        // System.out.println(pop);can'nt access beacuse under {} there are loacl variable so that we can'nt access it
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
