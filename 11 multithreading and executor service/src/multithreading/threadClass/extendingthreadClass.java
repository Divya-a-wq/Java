package multithreading.threadClass;

public class extendingthreadClass {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        firstTask t1=new firstTask();
        secondtask t2=new secondtask();
        thirdTask t3=new thirdTask();
        System.out.println("\nstarting first thread");
        t1.start();
        System.out.println("\nstarting second thread");
        t2.start();
        System.out.println("\nstarting third thread");
        t3.start();
        long endtime=System.currentTimeMillis();
        System.out.printf("%s total time taken: %d",Thread.currentThread().getName(),(endtime-starttime));
    }
}
