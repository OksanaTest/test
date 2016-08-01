package com.goit.finalProject.aircraftsForSikorskyFactory;

import com.goit.finalProject.Helicopter;
import com.goit.finalProject.parser.InitialValuesParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Map;

public class SikorskySH_3 implements Helicopter{
    private static String AircraftName;
    private static String VendorName;
    private static String AircraftType;
    private static Integer FuelEndurance;
    private static Integer LengthMorphingHelicopterRotor;
    private static Integer FlyingRange;
    private static Integer SeatingCapacity;
    private static Integer WeightLift;
/*
fields initialization with values from .json file with initial parameters for Sikorsky SH - 3
 */
    static {

        try {
            InitialValuesParser initialValuesParser = new InitialValuesParser();
            for (Object o : initialValuesParser.sikorskySH3InitialValues().entrySet()) {
                Map.Entry entry = (Map.Entry) o;
                if (entry.getKey().toString().equalsIgnoreCase("aircraftType")){
                    AircraftType = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("vendorName")){
                    VendorName = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("helicopterName")) {
                    AircraftName = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("LengthMorphingHelicopterRotor")){
                    LengthMorphingHelicopterRotor = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("FuelEndurance")){
                    FuelEndurance = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("SeatingCapacity")){
                    SeatingCapacity = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("FlyingRange")){
                    FlyingRange = Integer.parseInt(entry.getValue().toString());
                }
                if (entry.getKey().toString().equalsIgnoreCase("WeightLift")){
                    WeightLift = Integer.parseInt(entry.getValue().toString());
                }
            }
        } catch (NullPointerException e){
            System.err.println("[ERROR]: SOME INITIAL VALUES FOR Sikorsky SH - 3 CAN NOT BE READ FROM FILE");
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for(StackTraceElement element: stackTraceElements){
                System.err.println(element);}
        }catch (ClassCastException e) {System.err.println("[ERROR]:WRONG InitialValues FILE STRUCTURE");
        }catch (ParseException e){ System.err.println("[ERROR]: ERROR IN THE InitialValues file FIR SIKORSKY SH - 3");
        }catch (IOException e){
            System.out.println("[ERROR]: IO Exception IS OCCUR");
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for(StackTraceElement element: stackTraceElements){
                System.err.println(element);}
        }catch (Exception e){
            System.out.println("GENERAL ERROR");}
    }
    public String getAircraftName(){
        return AircraftName;
    };
    public String getVendorName(){
        return VendorName;
    };
    public Integer getFuelEndurance(){
        return FuelEndurance;
    };
    public Integer getLengthMorphingHelicopterRotor(){
        return LengthMorphingHelicopterRotor;
    };
    public String getAircraftType(){
        return AircraftType;
    };
    public Integer getFlyingRange(){
        return FlyingRange;
    };
    public Integer getSeatingCapacity(){
        return SeatingCapacity;
    };
    public Integer getWeightLift(){
        return WeightLift;
    };
}
