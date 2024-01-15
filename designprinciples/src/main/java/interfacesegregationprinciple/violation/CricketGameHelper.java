package interfacesegregationprinciple.violation;

public class CricketGameHelper {

    public void bat(Player player) {
        player.bat();
    }

    public void bowl(Player player) {
        if (player instanceof AllRounder)
            player.bowl();
    }

    public void field(Player player) {
        if (player instanceof WicketKeeper)
            return;
        player.field();
    }

    public void keep(Player player) {
        if (player instanceof WicketKeeper)
            player.keepWicket();
    }
}
