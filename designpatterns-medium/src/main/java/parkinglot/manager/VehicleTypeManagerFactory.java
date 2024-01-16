package parkinglot.manager;

import parkinglot.data.VehicleType;

public class VehicleTypeManagerFactory {

    private VehicleTypeManagerFactory() {}

    public static VehicleTypeManager getVehicleTypeManager(VehicleType vehicleType) {
        VehicleTypeManager vehicleTypeManager;
        if (vehicleType.equals(VehicleType.TWO_WHEELER))
            vehicleTypeManager = new TwoWheelerManager();
        else if (vehicleType.equals(VehicleType.FOUR_WHEELER))
            vehicleTypeManager = new FourWheelerManager();
        else
            vehicleTypeManager = new HeavyVehicleManager();

        return vehicleTypeManager;
    }

}
