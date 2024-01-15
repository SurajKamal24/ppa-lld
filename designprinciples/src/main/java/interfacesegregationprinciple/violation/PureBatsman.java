package interfacesegregationprinciple.violation;

public class PureBatsman implements Player {
    @Override
    public void bat() {
        System.out.println("PureBatsman is batting...");
    }

    @Override
    public void bowl() {
        throw new RuntimeException("PureBatsman can't bowl");
    }

    @Override
    public void field() {
        System.out.println("PureBatsman is fielding");
    }

    @Override
    public void keepWicket() {
        System.out.println("PureBatsman can't keep wicket");
    }
}
