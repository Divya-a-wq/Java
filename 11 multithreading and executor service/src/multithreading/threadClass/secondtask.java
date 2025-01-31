package multithreading.threadClass;

public class secondtask extends Thread{

        @Override
        public void run() {// run and then enter
            for (int i = 0; i <=1000; i++) {//task1
                System.out.printf("%d$ ",i);
            }
            System.out.printf("\n%s $ task complete",Thread.currentThread().getName());
    }
}
