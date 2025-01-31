package div.polymorphism;

public class testtransport {
    public static void main(String[] args) {

        Car cr=new Car();
        //vehicle vc=new vehicle();
        plane p=new plane();
//        cr.start();
//        p.start();
        //castTest(vc);
        castTest(cr);
        castTest(p);
        //vehicle vCar=new Car();//car is refrence vehicle//upcasting
        //Car cVehicle=new vehicle(); can't possible because har vehicle car nhi ho skata hai
        //Car cVehicle=(Car)new vehicle(); give error //trying downcast
        //Object ref=new vehicle();// because in all java all object are child of Object parent
    }
private static void castTest(vehicle veh){//down casting

     veh.start();
     //Car cVehicle=(Car) veh;
     //veh.noOfdoors();
     //cVehicle.start();
     //cVehicle.noOfdoors();
    if(veh instanceof Car){

    }
}



}
