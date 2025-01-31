package div.Abstraction;

public class testAbstraction {
    public static void main(String[] args) {
        //vehicle veh =new vehicle(4); because vehicle is abstract so we can't make their direct object
        Car car =new Car();
        car.commute();
        car.makeStartSound();
    }
}

