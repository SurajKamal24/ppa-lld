package memoryvisibility.rounds1;

public class Worker implements Runnable {

    private final int val;
    private final Object lock;
    private int rounds;

    public Worker(int val, Object lock, int rounds) {
        this.val = val;
        this.lock = lock;
        this.rounds = rounds;
    }

    @Override
    public void run() {
        while (rounds > 0) {
            while (compare()) {}
            System.out.println(val);
            synchronized (lock) {
                Main.curr = (Main.curr + 1)%10;
            }
            rounds--;
        }
    }
    private boolean compare() {
        boolean ans = false;
        synchronized (lock) {
            ans = !(val == Main.curr);
        }
        return ans;
    }
}
