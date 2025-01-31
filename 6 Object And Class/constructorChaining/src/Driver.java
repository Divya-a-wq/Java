public class Driver {
    static int minimumageOfDriving=18;
    String name;
    int age;
    String dateOfLicence;
    public boolean isAloowdToDrive(){
        return this.age>=minimumageOfDriving;

    }
    public static void main(String[] args) {
        Car swift=new Car("Red");
        Car thar=new Car();
        swift.start().drive();
        System.out.println(swift.color);

    }
}
