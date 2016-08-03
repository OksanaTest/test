package com.goit.finalProject.showInformation;


import com.goit.finalProject.Fleet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ShowFleetAndSortedPlaneByFlyingRangeInTheFile {
    public void controller() throws Exception {
        Fleet fleet = new Fleet();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("FLEET.txt")));
        StringBuilder toWrite = new StringBuilder();
        toWrite = toWrite.append("FLEET IS:" + "\n");
        for (int i = 0; i < fleet.commonFleet().size(); i++) {
            toWrite = toWrite.append(
                    "AIRCRAFT TYPE" + "\t" + fleet.commonFleet().get(i).getAircraftType() + "\t" +
                            "AIRCRAFT NAME" + "\t" + fleet.commonFleet().get(i).getAircraftName() + "\t" +
                            "AIRCRAFT VENDOR" + "\t" + fleet.commonFleet().get(i).getVendorName() + "\t" +
                            "SEATING CAPACITY" + "\t" + fleet.commonFleet().get(i).getSeatingCapacity() + "\t" +
                            "WEIGHT LIFT" + "\t" + fleet.commonFleet().get(i).getWeightLift() + "\t" +
                            "FUEL ENDURANCE" + "\t" + fleet.commonFleet().get(i).getFuelEndurance() + "\n");
        }
        toWrite.append("\n" + "PLANES SORTED BY FLYING RANGE: " + "\n");
        for (int i = 0; i < fleet.planesSortedByFlyingRange().size(); i++) {
            toWrite.append("PLANE NAME" + "\t" + fleet.planesSortedByFlyingRange().get(i).getAircraftName() + "\t" +
                    "FLYING RANGE" + "\t" + fleet.planesSortedByFlyingRange().get(i).getFlyingRange() + "\n");

        }
        out.println(toWrite);
        out.close();
    }

}
