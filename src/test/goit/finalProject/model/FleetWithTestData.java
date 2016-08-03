package test.goit.finalProject.model;

import com.goit.finalProject.projectCode.model.*;
import test.goit.finalProject.parserForTest.OrderParserForTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FleetWithTestData {
    private BoeingAircraftCreationFactory boeingAircraftCreationFactory;
    private SikorskyAircraftCreationFactory sikorskyAircraftCreationFactory;
    public List<Plane> createAllBoeingPlanOrderTest() throws Exception{
        boeingAircraftCreationFactory = new BoeingAircraftCreationFactory();
        List<Plane> planeList = new ArrayList<>();
        OrderParserForTests parserAgain = new OrderParserForTests();

        for (Object o : parserAgain.boeingPlanOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            planeList.addAll(boeingAircraftCreationFactory.createPlane
                    (entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }//create List<List<Plane>> list of all boeing plan in the order
        return planeList;
    }
    public  List<Helicopter> createAllBoeingHelicopterOrderTest() throws Exception{
        OrderParserForTests parserAgain = new OrderParserForTests();
        boeingAircraftCreationFactory = new BoeingAircraftCreationFactory();
        List<Helicopter> helicopterList = new ArrayList<>();

        for (Object o : parserAgain.boeingHelicopterOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            helicopterList.addAll(boeingAircraftCreationFactory.
                    createHelicopter(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }
        return helicopterList;
    }
    public  List<Aerostat> createAllBoeingAerostatTest() throws Exception{
        OrderParserForTests parserAgain = new OrderParserForTests();
        boeingAircraftCreationFactory = new BoeingAircraftCreationFactory();
        List<Aerostat> aerostatList = new ArrayList<>();

        for (Object o : parserAgain.boeingAerostatOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            aerostatList.addAll(boeingAircraftCreationFactory.
                    crateAerostat(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }
        return aerostatList;
    }
    public  List<Plane> createAllSikorskyPlanOrderTest() throws Exception{
        OrderParserForTests parserAgain = new OrderParserForTests();
        sikorskyAircraftCreationFactory =
                new SikorskyAircraftCreationFactory();
        List<Plane> planeListTest = new ArrayList<>();

        for (Object o : parserAgain.sikorskyPlanOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            planeListTest.addAll(sikorskyAircraftCreationFactory.
                    createPlane(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }
        return planeListTest;
    }
    public  List<Helicopter> createAllSikorskyHelicopterOrderTest() throws Exception{
        OrderParserForTests parserAgain = new OrderParserForTests();
        sikorskyAircraftCreationFactory = new SikorskyAircraftCreationFactory();
        List<Helicopter> helicopterListTest = new ArrayList<>();

        for (Object o : parserAgain.sikorskyHelicopterOrderPrepare().entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            helicopterListTest.addAll(sikorskyAircraftCreationFactory.
                    createHelicopter(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString())));
        }
        return helicopterListTest;
    }

    public  List<Aircraft> commonFleetTest() throws Exception{
        List<Plane> planeListTest, planeListSikorskyTest;
        List<Helicopter> boeingHelicopterListTest, sikorskyHelicopterListTest;
        List<Aerostat> boeingAerostatListTest;
        List<Aircraft> aircraftListTest = new ArrayList<>();

        planeListTest = createAllBoeingPlanOrderTest();
        planeListSikorskyTest = createAllSikorskyPlanOrderTest();
        boeingHelicopterListTest = createAllBoeingHelicopterOrderTest();
        sikorskyHelicopterListTest = createAllSikorskyHelicopterOrderTest();
        boeingAerostatListTest = createAllBoeingAerostatTest();

        aircraftListTest.addAll(planeListTest);
        aircraftListTest.addAll(planeListSikorskyTest);
        aircraftListTest.addAll(boeingHelicopterListTest);
        aircraftListTest.addAll(boeingAerostatListTest);
        aircraftListTest.addAll(sikorskyHelicopterListTest);
        return aircraftListTest;
    }
    public  List<Plane> allPlanesTest() throws Exception{
        List<Plane> aircraftListTest = new ArrayList<>();
        aircraftListTest.addAll(createAllBoeingPlanOrderTest());
        aircraftListTest.addAll(createAllSikorskyPlanOrderTest());
        return aircraftListTest;
    }
    public  List<Plane> planesSortedByFlyingRangeTest() throws Exception{
        List<Plane> aircraftList = allPlanesTest();
        Collections.sort(aircraftList, new FleetComparator());
        return aircraftList;
    }

    public  Integer summarySeatingCapacityTest() throws Exception{
        int summarySeatingCapacity = 0;
        for (int i = 0; i < commonFleetTest().size(); i++){
            summarySeatingCapacity += commonFleetTest().get(i).getSeatingCapacity();
        }
        return summarySeatingCapacity;
    }

    public  Integer summaryWeightLiftTest() throws Exception{
        int summaryWeightLift = 0;
        for (int i = 0; i < commonFleetTest().size(); i++){
            summaryWeightLift += commonFleetTest().get(i).getWeightLift();
        }
        return summaryWeightLift;
    }

    public  List<Plane> findPlaneByFuelEnduranceTest(int a, int b) throws Exception{
        List<Plane> planeList = allPlanesTest();
        List<Plane> planes = new ArrayList<>();
        for (Plane aPlaneList : planeList) {
            if (aPlaneList.getFuelEndurance() > a && aPlaneList.getFuelEndurance() < b) {
                planes.add(aPlaneList);
            }
        }
        return planes;
    }
}
