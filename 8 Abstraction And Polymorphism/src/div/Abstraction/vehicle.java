package div.Abstraction;

public abstract class vehicle implements transport{
    private int noOfTyre;

    public abstract void makeStartSound();

    @Override
    public void getsetGo() {
        System.out.println("going to place ");
    }


    public vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }
    public void commute(){
        System.out.println("going");
    }
}
