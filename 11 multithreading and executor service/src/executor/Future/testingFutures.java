package executor.Future;

import java.util.concurrent.*;

public class testingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
                ExecutorService service= Executors.newFixedThreadPool(3);
        fetchName task1=new fetchName("divya");
        fetchName task2=new fetchName("kavya");
        fetchName task3=new fetchName("rivya");
        fetchName task4=new fetchName("sivya");

       Future<String> name1=service.submit(task1);//future promise kind of thing
        Future<String> name2=service.submit(task2);//future promise kind of thing
        Future<String> name3=service.submit(task3);//future promise kind of thing
        Future<String> name4=service.submit(task4);//future promise kind of thing
        System.out.printf("\nfull name is: %s",name1.get());
        System.out.printf("\nfull name is: %s",name2.get());
        System.out.printf("\nfull name is: %s",name3.get());
        System.out.printf("\nfull name is: %s",name4.get());
        service.shutdown();
    }
}
