package problems.evenodd;

public class Main {
    public static final int limit = 20;
    public static volatile int curr = 1;
    public static void main(String[] args) {
        Thread t1 = new Thread(new EvenWorker("even"));
        Thread t2 = new Thread(new OddWorker("odd"));
        t1.start();
        t2.start();
    }
}
