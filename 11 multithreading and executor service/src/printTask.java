public class printTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <=1000; i++) {//task3
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n%s %c task complete",Thread.currentThread().getName(),targetChar);
    }



    private final char targetChar;
    public printTask(char targetChar) {
        this.targetChar = targetChar;
    }

}
