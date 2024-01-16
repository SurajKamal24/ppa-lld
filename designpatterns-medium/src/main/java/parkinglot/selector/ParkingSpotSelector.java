package parkinglot.selector;

import parkinglot.data.ParkingSpot;

import java.util.List;

public interface ParkingSpotSelector {

    ParkingSpot selectSpot(List<ParkingSpot> parkingSpots);

}
