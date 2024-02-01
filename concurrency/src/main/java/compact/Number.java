package compact;

public class Number {

    private int x;

    public Number() {
        x = 0;
    }

    public synchronized int getX(){
        return x;
    }

    public synchronized void setX(int val) {
        x = val;
    }

    public synchronized void increment() {
        int oldVal = getX();
        setX(oldVal + 1);
    }
// re-entering
    // reentrant
}
