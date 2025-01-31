package in.divs;

import in.div.Car;
//import div.Default;

public class DefaultTest {
    public static void main(String[] args) {
        Car car=new Car("yellow","dezire",5,30000);
        car.color="black";//keval model aur color ko  access karane dega kyoki color aur model dono public hain ....aur public ko hi ham dusre package ke class me easily use kar sakte hain
//        Default def= "abc";// can't possible because Default default access modifiers

    }
}
