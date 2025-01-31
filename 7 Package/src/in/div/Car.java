package in.div;

public class Car {
    public String color;//public
    public String model;//public
    private  double fuelLevel;//private
    int costOfPurchase;//default

    // Default constructor
    public Car() {

    }

    // Parameterized constructor
    public Car(String color, String model, double fuelLevel, int costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }
}


