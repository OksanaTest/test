package com.goit.finalProject.projectCode.controller;

import com.goit.finalProject.projectCode.view.*;

import java.util.Scanner;

public class Controller {
    public void controller() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("to see full information about fleet in the FLEET.txt file enter a" + "\n" +
                "to see full information about fleet in the console enter b" + "\n" +
                "to see information about fleet and planes sorted by flying range in the FLEET.txt file enter c" + "\n" +
                "to see information about fleet and planes sorted by flying range in the console enter d" + "\n" +
                "to see information about summary seating and weight in the FLEET.txt file enter e" + "\n" +
                "to see information about summary seating and weight in the console enter f" + "\n" +
                "if you enter something else full information about fleet will be output in the console, pay attention :)");

        String choice = input.nextLine();
        switch (choice) {
            case "a":
                ShowAllInTheFile showAllInTheFile = new ShowAllInTheFile();
                showAllInTheFile.controller();
                break;
            case "b":
                ShowAllInTheConsole showAllInTheConsole = new ShowAllInTheConsole();
                showAllInTheConsole.controller();
                break;
            case "c":
                ShowFleetAndSortedPlaneByFlyingRangeInTheFile showFleetAndSortedPlaneByFlyingRangeInTheFile
                = new ShowFleetAndSortedPlaneByFlyingRangeInTheFile();
                showFleetAndSortedPlaneByFlyingRangeInTheFile.controller();
                break;
            case "d":
                ShowFleetAndSortedPlaneByFlyingRangeInConsole showFleetAndSortedPlaneByFlyingRangeInConsole
                 = new ShowFleetAndSortedPlaneByFlyingRangeInConsole();
                showFleetAndSortedPlaneByFlyingRangeInConsole.controller();
                break;
            case "e":
                ShowSummarySeatingAndWeightLiftInThrFile showSummarySeatingAndWeightLiftInThrFile
                        = new ShowSummarySeatingAndWeightLiftInThrFile();
                showSummarySeatingAndWeightLiftInThrFile.controller();
                break;
            case "f":
                ShowSummarySeatingAndWeightLiftInTheConsole showSummarySeatingAndWeightLiftInTheConsole
                        = new ShowSummarySeatingAndWeightLiftInTheConsole();
                showSummarySeatingAndWeightLiftInTheConsole.controller();
                break;
             default:
                 System.out.println("Full information about FLEET is below:" + "\n");
                 ShowAllInTheConsole showAllInTheConsole1 = new ShowAllInTheConsole();
                 showAllInTheConsole1.controller();
                 break;
        }
    }
}

