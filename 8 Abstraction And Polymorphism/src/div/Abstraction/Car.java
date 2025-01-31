package div.Abstraction;

public class Car extends vehicle{
private int noOfDoors;
    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("broom........");
    }
}

