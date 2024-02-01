package threadsafety.mutablewithsync;

public class Main {
    public static void main(String[] args) {
        NumStore numStore = new NumStore();
        Thread t1 = new Thread(new Worker("Thread A", numStore));
        Thread t2 = new Thread(new Worker("Thread B", numStore));
        Thread t3 = new Thread(new Worker("Thread C", numStore));
        t1.start();
        t2.start();
        t3.start();
    }
}
