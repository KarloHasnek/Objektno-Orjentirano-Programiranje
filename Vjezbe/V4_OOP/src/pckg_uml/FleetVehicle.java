package pckg_uml;

import java.util.ArrayList;

public class FleetVehicle {
    
    private ArrayList<Vehicle> vehicles;
    
    public FleetVehicle() {
        vehicles = new ArrayList<>();
    }

    public void addVehicleToFleet(Vehicle vehicle) {

        if (vehicles.contains(vehicle)) {
            System.out.println("Vehicle with car plate: " + vehicle.getCarPlate() + "already exists in fleet!!!");
        } else {
            vehicles.add(vehicle);
            System.out.println("Vehicle added to fleet!");
        }
    }

    public Vehicle removeVehicleFromFleet(Vehicle vehicle) {
        
        Vehicle veh = null;
        if (vehicles.contains(vehicle)) {
            veh = vehicle;
            vehicles.remove(vehicle);
            System.out.println(veh.getCarPlate() + "Removed from fleet!");
        } else {
            System.out.println("Vehicle is not in the fleet - nothing to remove!");
        }

        return veh;
    }

    public void listAllInFleet() {

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
