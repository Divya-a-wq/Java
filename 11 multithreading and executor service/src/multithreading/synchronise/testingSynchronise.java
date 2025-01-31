package multithreading.synchronise;

public class testingSynchronise {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        counter counter=new counter();
        updaterThread t1=new updaterThread(counter);
        updaterThread t2=new updaterThread(counter);


        try {
            t1.start();
            t2.start();
            t1.join();


            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interuppted: "+e.getMessage());
        }
        long endtime=System.currentTimeMillis();
        System.out.printf("final counter :%d and"+ "the time taken :%d",counter.getCount(),
                (starttime-endtime));


    }
}
