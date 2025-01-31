public class needOfMultithreading {
    public static void main(String[] args) {
 long starttime=System.currentTimeMillis();

        for (int i = 0; i <=1000; i++) {//task1
            System.out.printf("%d* ",i);
        }
        System.out.println("\n * task complete");
        for (int i = 0; i <=1000; i++) {//task2
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n $ task complete");
        for (int i = 0; i <=1000; i++) {//task3
            System.out.printf("%d# ",i);
        }
        System.out.println("\n # task complete");
        long endtime=System.currentTimeMillis();
        System.out.printf("total time taken: %d",(endtime-starttime));
    }
}