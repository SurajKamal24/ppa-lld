package compact;

import compoundaction.EventContainer;

public class Worker implements Runnable {

    private final Number number;

    public Worker(Number number) {
        this.number = number;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            number.increment();
        }

    }

    // thread-safe(compound action) = thread-safe(A1), thread-safe(A2)
    // check-then-act
}
