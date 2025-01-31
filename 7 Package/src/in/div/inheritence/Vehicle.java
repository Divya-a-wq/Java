package in.div.inheritence;

public class Vehicle {
    public  int noOfTyre;
    //public int noOfTyre;
    // int noOftyre
    //private int noOfTyre; encapsulation kar rhe hain to ye child class n-me nhi ja sakti hai so hame jo cheeje child ko inheritet karni hai use simply non private hi karte hai
    public void setNoOfTyre(int noOfTyre){
        this.noOfTyre=noOfTyre;
    }


        public String toString(){
            return "vehicle no of tyre:"+noOfTyre;

    }

    public void commute(){
        System.out.printf("i am going from place A to place B using %d tyres\n",noOfTyre);
    }
}
