package multithreading.threadClass;

public class thirdTask extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=1000; i++) {//task3
            System.out.printf("%d# ",i);
        }
        System.out.printf("\n%s # task complete",Thread.currentThread().getName());
    }
}
