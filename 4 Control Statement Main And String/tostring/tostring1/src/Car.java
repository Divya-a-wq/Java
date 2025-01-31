public class Car {
    int noOfWheel;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;
    public Car(int noOfWheel, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheel = noOfWheel;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }
    @Override
    public String toString() {
        return "Car [noOfWheel=" + noOfWheel + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name=" + name
                + ", modelNumber=" + modelNumber + ", company=" + company + "]";
    }
//     @Override
//     public String toString(){
//     final StringBuilder sp=new StringBuilder("car{");
//     sp.append(",noOfWheel=").append(noOfWheel);
// sp.append(",noOfDoors=").append(noOfDoors);
// sp.append(",maxSpeed=").append(maxSpeed);
// sp.append(",name=").append(name);
// sp.append(",modelNumber=").append(modelNumber);
// sp.append(",company=").append(company).append('\'');
// sp.append('}');
// return sp.toString();

//     }

    public static void main(String[] args) {
        Car swift =new Car(4,4,120,"swift","sw867","maruti");
        System.out.println(swift.toString());
    }

}