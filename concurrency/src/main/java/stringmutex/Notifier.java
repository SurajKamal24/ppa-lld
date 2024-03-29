package stringmutex;

public class Notifier implements Runnable {

    private final String s2 = "abc";
    @Override
    public void run() {
        synchronized (s2) {
            s2.notifyAll();
            System.out.println("notifier exiting");
        }
    }
}
