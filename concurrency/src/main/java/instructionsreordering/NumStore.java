package instructionsreordering;

public class NumStore {

    private int x, y, z, w;

    public NumStore() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }

    public synchronized void incr() {
        x++;
        y++;
        z++;
        w++;
    }

    public synchronized int getX() {
        return x;
    }

    public synchronized int getY() {
        return y;
    }

    public synchronized int getZ() {
        return z;
    }

    public synchronized int getW() {
        return w;
    }
}
