package parkinglot.selector;

import parkinglot.data.EntryPoint;

public class SpotSelectorFactory {

    private SpotSelectorFactory() {}

    public static ParkingSpotSelector getNearestSelector(EntryPoint entryPoint) {
        return new NearestSelector(entryPoint);
    }

    public static ParkingSpotSelector getRandomSelector() {
        return new RandomSelector();
    }

}
