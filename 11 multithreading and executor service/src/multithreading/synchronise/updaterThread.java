package multithreading.synchronise;

public class updaterThread extends Thread{
    private final counter counter;

    public updaterThread(counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
counter.increment();
        }
    }
}
