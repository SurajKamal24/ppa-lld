package threadsafety.nosharedobject;

public class Worker implements Runnable {

    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from " + name);
        }
    }
}
