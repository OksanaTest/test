package com.goit.finalProject.showInformation;

import com.goit.finalProject.Fleet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ShowSummarySeatingAndWeightLiftInThrFile {
    public void controller() throws Exception {
        Fleet fleet = new Fleet();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("FLEET.txt")));
        StringBuilder toWrite = new StringBuilder();
        toWrite.append("\n" + "FLEET'S SUMMARY SEATING CAPACITY:" + "\n" +
                fleet.summarySeatingCapacity() + "\n");
        toWrite.append("\n" + "FLEET'S SUMMARY WEIGHT LIFT:" + "\n" +
                fleet.summaryWeightLift() + "\n");
        out.println(toWrite);
        out.close();
    }
}
