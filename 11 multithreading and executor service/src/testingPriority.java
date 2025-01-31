

public class testingPriority {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        printTask p1=new printTask('*');
        printTask p2=new printTask('$');
        printTask p3=new printTask('#');
        Thread t1=new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);//it actually work when system is busy
        t1.start();
        Thread t2=new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);//lower priorityonly 1 to 10
        t2.start();
        Thread t3=new Thread(p3);//1 to 10 priority is possible
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        long endtime=System.currentTimeMillis();
        System.out.printf("%s total time taken: %d",Thread.currentThread().getName(),(endtime-starttime));
    }
}