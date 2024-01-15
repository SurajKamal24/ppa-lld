package interfacesegregationprinciple.conformation;

public class WicketKeeper implements Player, Keeper {
    @Override
    public void keepWicket() {
        System.out.println("WicketKeeper is keeping...");
    }

    @Override
    public void bat() {
        System.out.println("WicketKeeper is batting...");
    }
}
