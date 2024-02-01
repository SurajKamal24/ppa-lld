package problems.evenoddsync;

public class Main {
    public static final int limit = 20;
    public static int curr = 1;
    public static void main(String[] args) {
        Object lock = new Object();
        Thread t1 = new Thread(new EvenWorker("even", lock));
        Thread t2 = new Thread(new OddWorker("odd", lock));
        t1.start();
        t2.start();
    }
}
