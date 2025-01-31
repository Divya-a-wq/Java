package multithreading.testingJoin;

import multithreading.runnable.printTask;

public class testingjoin {
    public static void main(String[] args) throws InterruptedException{
        long starttime=System.currentTimeMillis();
        printTask p1=new printTask('*');
        printTask p2=new printTask('$');
        printTask p3=new printTask('#');
        Thread t1=new Thread(p1);
        t1.start();
        System.out.println("thread 1 started");
        Thread t2=new Thread(p2);
        t2.start();
        System.out.println("thread 2 started");
        t1.join();//jbtk t1 complete n ho tbtk mainthread t3ko  run nhi karega
        Thread t3=new Thread(p3);
        t3.start();
        System.out.println("thread 3 started");
        long endtime=System.currentTimeMillis();
        System.out.printf("%s total time taken: %d",Thread.currentThread().getName(),(endtime-starttime));
    }
}

