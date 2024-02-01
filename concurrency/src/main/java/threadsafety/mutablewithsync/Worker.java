package threadsafety.mutablewithsync;

public class Worker implements Runnable {

    private final String name;
    private final NumStore numStore;

    public Worker(String name, NumStore numStore) {
        this.name = name;
        this.numStore = numStore;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + numStore.getAndIncrement());
        }
    }
}
