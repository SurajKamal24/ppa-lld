package second;

public class NumberStore {
    private int x;

    public NumberStore() {
        this.x = 0;
    }

    public void increment() {
        x++;


        // x = x+1 3-step process: i. Fetch ii. x+1 iii. Write
        // Critical section
        // atomic
    }

    // T1 F | T2 some_other | T1 C U | T2 F
    // locking : acquire lock on any object, 'x'
    // acquire a lock on x
    // critical section
    // release lock on x
    // T1 F(5) | T2 F(5) | T1 x = 6 | T2 x = 6
    // Race condition

    public synchronized int getX() {
        return x;
    }

}
