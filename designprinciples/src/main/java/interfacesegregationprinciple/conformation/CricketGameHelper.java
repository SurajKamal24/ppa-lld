package interfacesegregationprinciple.conformation;

public class CricketGameHelper {

    public void bat(Player player) {
        player.bat();
    }

    public void bowl(Bowler bowler) {
        bowler.bowl();
    }

    public void field(Fielder fielder) {
        fielder.field();
    }

    public void keep(WicketKeeper keeper) {
        keeper.keepWicket();
    }
}
