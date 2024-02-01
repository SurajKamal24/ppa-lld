package compoundaction;

public class Worker implements Runnable {

    private final EventContainer container;

    public Worker(EventContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        container.increment();
    }
}
