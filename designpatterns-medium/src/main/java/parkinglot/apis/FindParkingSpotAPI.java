package parkinglot.apis;

import parkinglot.data.EntryPoint;
import parkinglot.data.ParkingSpot;
import parkinglot.data.SpotSelection;
import parkinglot.data.VehicleType;
import parkinglot.finder.ParkingSpotFinder;
import parkinglot.manager.VehicleTypeManager;
import parkinglot.manager.VehicleTypeManagerFactory;
import parkinglot.selector.ParkingSpotSelector;
import parkinglot.selector.SpotSelectorFactory;

public class FindParkingSpotAPI {

    public ParkingSpot findParkingSpot(EntryPoint entryPoint, VehicleType vehicleType, SpotSelection spotSelection) {
        VehicleTypeManager vehicleTypeManager = VehicleTypeManagerFactory.getVehicleTypeManager(vehicleType);
        ParkingSpotSelector parkingSpotSelector;
        if (spotSelection.equals(SpotSelection.RANDOM))
            parkingSpotSelector = SpotSelectorFactory.getRandomSelector();
        else if (spotSelection.equals(SpotSelection.NEAREST))
            parkingSpotSelector = SpotSelectorFactory.getNearestSelector(entryPoint);
        else
            throw new RuntimeException("Invalid spotSelection");
        return new ParkingSpotFinder(vehicleTypeManager, parkingSpotSelector).findParkingSpot();
    }

}
