public class Driver {
    static int minimumageOfDriving=18;
    String name;
    int age;
    String dateOfLicence;
    public boolean isAloowdToDrive(){
        return this.age>=minimumageOfDriving;

    }
    public static void main(String[] args) {
//         Car myCar=new Car();
//         myCar.addFuel(6);
//         myCar.drive();
//         myCar.drive();
//         myCar.drive();
// myCar.addFuel(6);
// myCar.drive();
//     System.out.println(myCar.getCurrentFuelInLiters());
// Car swift=new Car("Red");// constructor object return karta hai that,s why return type ki need nhi hoti
// //constructor ka name same hota hai class ke name se
// // swift.addFuel(6);
// // Car startedCar=swift.start();
// // startedCar.drive();
// swift.start().drive();
// System.out.println(swift.color);
        Driver myDriver=new Driver();
        myDriver.dateOfLicence="1/jan/2024";
        System.out.println(minimumageOfDriving);
    }
}