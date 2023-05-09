package pckg_uml;

public class TestFleet {
    
    public static void main(String[] args) {
        
        FleetVehicle fleetVeh = new FleetVehicle();
        fleetVeh.addVehicleToFleet(new Vehicle(MANUFACTURER.MercedesBenz, "124"));
        fleetVeh.addVehicleToFleet(new Vehicle(MANUFACTURER.BMW, "E30"));
        Vehicle veh = new Vehicle(MANUFACTURER.Tesla, "S");
        fleetVeh.addVehicleToFleet(veh);
        fleetVeh.addVehicleToFleet(veh);
        Vehicle veh2 = new Vehicle(MANUFACTURER.Renault, "Austral");
        fleetVeh.removeVehicleFromFleet(veh2);

        fleetVeh.listAllInFleet();
    }

}
