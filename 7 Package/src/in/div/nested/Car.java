package in.div.nested;

public class Car { //class ko keval public aur default kar sakte hai
    private int noOfDoors;
    public void repair(){
        Tyre t=new Tyre();
    }
//    private static class Tyre{// sub class ko har ek access modifiers se define kar sakte hai
//        private double width;
//        private double pressure;
//        private String material;
//        public void inflate(){
//            noOfDoors=4;
    private  class Tyre{// sub class ko har ek access modifiers se define kar sakte hai
        private double width;
        private double pressure;
        private String material;
        public void inflate(){
            noOfDoors=4;
        }

    }
}
