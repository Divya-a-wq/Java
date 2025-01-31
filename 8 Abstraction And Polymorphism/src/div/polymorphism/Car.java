package div.polymorphism;

 class Car extends vehicle{
     Car(){
         super();
     }
     Car(int noOfTyre){
         super(noOfTyre);
     }
    public int  noOfdoors(){
        return 4;
    }

     @Override
     public void start() {
         System.out.println(super.getNoOfTyre());
         System.out.println("car is starting");
     }
 }
