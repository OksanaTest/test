package com.goit.finalProject.aircraftsForBoeingFactory;

import com.goit.finalProject.Plane;
import com.goit.finalProject.parser.InitialValuesParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Map;

public class Boeing737Plane implements Plane {
    private static String AircraftType;
    private static String VendorName;
    private static String PlaneName;
    private static String PlaneType;
    private static Integer SeatingCapacity;
    private static Integer FuelEndurance;
    private static Integer FlyingRange;
    private static Integer WeightLift;
/*
fields initialization with values from .json file with initial parameters for Boeing 737
 */
    static {

        try {
            InitialValuesParser initialValuesParser = new InitialValuesParser();
            for (Object o : initialValuesParser.boeing737InitialValues().entrySet()) {
                Map.Entry entry = (Map.Entry) o;
                if (entry.getKey().toString().equalsIgnoreCase("aircraftType")){
                    AircraftType = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("vendorName")){
                    VendorName = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("planeName")) {
                    PlaneName = entry.getValue().toString();
                }
                if (entry.getKey().toString().equalsIgnoreCase("planeType")){
                    PlaneType = entry.getValue().toString();
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
            System.err.println("[ERROR]: SOME INITIAL VALUES FOR Boeing 737 CAN NOT BE READ FROM FILE");
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for(StackTraceElement element: stackTraceElements){
                System.err.println(element);}
        } catch (ClassCastException e) {System.err.println("[ERROR]:WRONG InitialValues FILE STRUCTURE");
        }catch (ParseException e){ System.err.println("[ERROR]: ERROR IN THE InitialValues file FOR BOEING 737");
        }catch (IOException e){
            System.out.println("[ERROR]: IO Exception IS OCCUR");
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for(StackTraceElement element: stackTraceElements){
                System.err.println(element);}
        }catch (Exception e){
            System.out.println("GENERAL ERROR");}
    }
    public String getAircraftType(){
        return AircraftType;
    };
    public String getAircraftName(){
        return PlaneName;
    };
    public String getPlaneType(){
        return PlaneType;
    };
    public String getVendorName(){
        return VendorName;
    };
    public Integer getFuelEndurance(){
        return FuelEndurance;
    };
    public Integer getFlyingRange(){
        return FlyingRange;
    };
    public Integer getWeightLift(){
        return WeightLift;
    };
    public Integer getSeatingCapacity(){
        return SeatingCapacity;
    };
}
