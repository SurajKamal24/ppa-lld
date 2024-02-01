package threadsafety.nosharedobject;



public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker("Thread A"));
        Thread t2 = new Thread(new Worker("Thread B"));
        Thread t3 = new Thread(new Worker("Thread C"));
        t1.start();
        t2.start();
        t3.start();
    }
}
