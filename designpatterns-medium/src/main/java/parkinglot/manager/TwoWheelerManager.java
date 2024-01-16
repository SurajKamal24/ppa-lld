package parkinglot.manager;

import parkinglot.data.ParkingSpot;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TwoWheelerManager implements VehicleTypeManager {

    @Override
    public List<ParkingSpot> getParkingSpots() {
       List<ParkingSpot> parkingSpots = null;
       return parkingSpots;
    }

    @Override
    public double getParkingFees(double durationInHours) {
        return 0;
    }
}
