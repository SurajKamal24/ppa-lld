package parkinglot.manager;

import parkinglot.data.ParkingSpot;

import java.util.List;

public class FourWheelerManager implements VehicleTypeManager {
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
