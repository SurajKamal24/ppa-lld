package problems.contsumunsafe;

public class Main {
    public static int sum = 0;
    public static void main(String[] args) {
        Container container = new Container();
        Object lock = new Object();
        Thread t1 = new Thread(new Worker(container, lock));
        Thread t2 = new Thread(new Worker(container, lock));
        Thread t3 = new Thread(new Worker(container, lock));
        Thread t4 = new Thread(new Worker(container, lock));
        Thread t5 = new Thread(new Worker(container, lock));
        Thread t6 = new Thread(new Worker(container, lock));
        Thread t7 = new Thread(new Worker(container, lock));
        Thread t8 = new Thread(new Worker(container, lock));
        Thread t9 = new Thread(new Worker(container, lock));
        Thread t10 = new Thread(new Worker(container, lock));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        System.out.println(sum);
    }
}
