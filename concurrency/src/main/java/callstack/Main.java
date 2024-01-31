package callstack;

public class Main {
    private static int func2() {
        return 0;
    }
    private static int func1() {
        int x  = func2();
        if (x == 0)
            throw new RuntimeException();
        return x;
    }
    public static void main(String[] args) {
        try {
            Thread t = new Thread(new MyRunnable());
            t.start();
        } catch (Exception e) {
            System.out.println("caught...");
        }
    }

}
