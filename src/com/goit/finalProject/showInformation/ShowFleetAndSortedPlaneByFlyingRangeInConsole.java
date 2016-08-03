package com.goit.finalProject.showInformation;


import com.goit.finalProject.Fleet;

public class ShowFleetAndSortedPlaneByFlyingRangeInConsole {
    public void controller() throws Exception {
        Fleet fleet = new Fleet();
        System.out.println("FLEET IS:" + "\n");
        for (int i = 0; i < fleet.commonFleet().size(); i++) {
            System.out.println(
                    "AIRCRAFT TYPE" + "\t" + fleet.commonFleet().get(i).getAircraftType() + "\t" +
                            "AIRCRAFT NAME" + "\t" + fleet.commonFleet().get(i).getAircraftName() + "\t" +
                            "AIRCRAFT VENDOR" + "\t" + fleet.commonFleet().get(i).getVendorName() + "\t" +
                            "SEATING CAPACITY" + "\t" + fleet.commonFleet().get(i).getSeatingCapacity() + "\t" +
                            "WEIGHT LIFT" + "\t" + fleet.commonFleet().get(i).getWeightLift() + "\t" +
                            "FUEL ENDURANCE" + "\t" + fleet.commonFleet().get(i).getFuelEndurance() + "\n");
        }
        System.out.println("\n" + "PLANES SORTED BY FLYING RANGE: " + "\n");
        for (int i = 0; i < fleet.planesSortedByFlyingRange().size(); i++) {
            System.out.println("PLANE NAME" + "\t" + fleet.planesSortedByFlyingRange().get(i).getAircraftName() + "\t" +
                    "FLYING RANGE" + "\t" + fleet.planesSortedByFlyingRange().get(i).getFlyingRange() + "\n");
        }
    }

}
