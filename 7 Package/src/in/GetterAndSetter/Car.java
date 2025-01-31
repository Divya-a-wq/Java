package in.GetterAndSetter;

public class Car {
    private  String color;//public
    private String model;//public
    private  double fuelLevel;//
    private int costOfPurchase;//

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("yellow")) {
            System.out.println("shut up");
        } else {

            this.color = color;
        }
    }

    public String getmodel() {
        return model;
    }

    public Car(String color, String model, double fuelLevel, int costOfPurchase) {


        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }
}
