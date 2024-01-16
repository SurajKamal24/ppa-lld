package parkinglot.manager;

import parkinglot.data.ParkingSpot;

import java.util.List;

public interface VehicleTypeManager {

    List<ParkingSpot> getParkingSpots();
    double getParkingFees(double durationInHours);

}
