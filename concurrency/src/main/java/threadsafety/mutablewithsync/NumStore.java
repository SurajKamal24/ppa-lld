package threadsafety.mutablewithsync;

public class NumStore {

    private int num;

    public NumStore() {
        num = 0;
    }

    public synchronized int get() {
        return num;
    }

    public synchronized void increment() {
        num++;
    }

    public synchronized int getAndIncrement() {
        int val = num;
        num++;
        return val;
    }
}
