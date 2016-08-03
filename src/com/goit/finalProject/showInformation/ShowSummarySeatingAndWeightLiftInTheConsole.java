package com.goit.finalProject.showInformation;


import com.goit.finalProject.Fleet;

public class ShowSummarySeatingAndWeightLiftInTheConsole {
    public void controller() throws Exception {
        Fleet fleet = new Fleet();
        System.out.println("FLEET'S SUMMARY SEATING CAPACITY:" + "\n" +
                fleet.summarySeatingCapacity() + "\n");
        System.out.println("FLEET'S SUMMARY WEIGHT LIFT:" + "\n" +
                fleet.summaryWeightLift() + "\n");
    }
}
