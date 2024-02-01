package threadsafety.sharedbutimmutable;

public class Worker implements Runnable {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " : My lucky number : " + Main.luckyNum);
        }
    }
}
