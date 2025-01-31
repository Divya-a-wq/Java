package div.polymorphism;

//public interface vehicle {
//    public void start();
//}
public abstract class vehicle {
    private int noOfTyre;
    vehicle() {
        this.noOfTyre = 0;
    }
        vehicle(int noOfTyres){
            this.noOfTyre=noOfTyres;
        }
        public int getNoOfTyre(){
        return this.noOfTyre;

        }
       // public final void start(){ can't override because of final keyword
            public void start(){
            System.out.println("vehicle is starting ");
        }
    }
