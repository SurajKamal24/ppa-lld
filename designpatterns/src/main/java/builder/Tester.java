package builder;

public class Tester {
    public static void main(String[] args) {
        new User.Builder(2, "Kamal").age(-9).build();
    }
}
