package problems.evenodd;

public class OddWorker implements Runnable {
    private final String name;

    public OddWorker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (Main.curr <= Main.limit) {
            if (Main.curr%2 != 0) {
                System.out.println(name + " " + Main.curr);
                Main.curr++;
            }
        }
    }
}
