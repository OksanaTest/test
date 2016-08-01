package com.goit.finalProject.aircraftsForBoeingFactory;

import com.goit.finalProject.Aerostat;
import com.goit.finalProject.parser.InitialValuesParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Map;

public class ATC07Aerostat implements Aerostat {
    private static String AircraftType;
    private static String VendorName;
    private static String AircraftName;
    private static Integer SeatingCapacity;
    private static Integer FuelEndurance;
    private static Integer WeightLift;
    private static Integer GasCylinderVolume;
    private static Integer FlightAltitudes;
/*
fields initialization with values from .json file with initial parameters for aerostat 07 ATC
 */
    static {

    try {
        InitialValuesParser initialValuesParser = new InitialValuesParser();
        for (Object o : initialValuesParser.boeingATC07AerostatInitialValues().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            if (entry.getKey().toString().equalsIgnoreCase("aircraftType")) {
                AircraftType = entry.getValue().toString();
            }
            if (entry.getKey().toString().equalsIgnoreCase("vendorName")) {
                VendorName = entry.getValue().toString();
            }
            if (entry.getKey().toString().equalsIgnoreCase("aerostatName")) {
                AircraftName = entry.getValue().toString();
            }
            if (entry.getKey().toString().equalsIgnoreCase("gasCylinderVolume")) {
                GasCylinderVolume = Integer.parseInt(entry.getValue().toString());
            }
            if (entry.getKey().toString().equalsIgnoreCase("FuelEndurance")) {
                FuelEndurance = Integer.parseInt(entry.getValue().toString());
            }
            if (entry.getKey().toString().equalsIgnoreCase("SeatingCapacity")) {
                SeatingCapacity = Integer.parseInt(entry.getValue().toString());
            }
            if (entry.getKey().toString().equalsIgnoreCase("FlightAltitudes")) {
                FlightAltitudes = Integer.parseInt(entry.getValue().toString());
            }
            if (entry.getKey().toString().equalsIgnoreCase("WeightLift")) {
                WeightLift = Integer.parseInt(entry.getValue().toString());
            }
        }
    } catch (NullPointerException e) {
        System.err.println("[ERROR]: SOME INITIAL VALUES FOR 07 ATC CAN NOT BE READ FROM FILE");
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements){
            System.err.println(element);}
    } catch (ClassCastException e) {
        System.err.println("[ERROR]:WRONG InitialValues FILE STRUCTURE");
    } catch (ParseException e) {
        System.err.println("[ERROR]: ERROR IN THE InitialValues file FOR 07 ATC");
    } catch (IOException e) {
        System.err.println("[ERROR]: IO Exception IS OCCUR");
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements){
            System.err.println(element);}
    }catch (Exception e){
        System.err.println("GENERAL ERROR");}
}
    public String getAircraftType(){
        return AircraftType;
    };
    public Integer getSeatingCapacity(){
        return SeatingCapacity;
    };
    public String getVendorName(){
        return VendorName;
    };
    public Integer getFuelEndurance(){
        return FuelEndurance;
    };
    public Integer getWeightLift(){
        return WeightLift;
    };
    public String getAircraftName(){
        return AircraftName;
    };
    public Integer getGasCylinderVolume(){
        return GasCylinderVolume;
    };
    public Integer getFlightAltitudes(){
        return FlightAltitudes;
    };
}
