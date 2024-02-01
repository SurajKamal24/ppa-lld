package second;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NumberStore numberStore = new NumberStore();
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Thread(new Worker(numberStore, o1));
        Thread t2 = new Thread(new Worker(numberStore, o2));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(numberStore.getX());
    }
}
