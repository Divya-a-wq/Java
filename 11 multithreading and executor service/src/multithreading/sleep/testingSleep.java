package multithreading.sleep;

public class testingSleep {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("before sleeping ");
        Thread.sleep(5000);
        System.out.println("wokeup");
    }
}
