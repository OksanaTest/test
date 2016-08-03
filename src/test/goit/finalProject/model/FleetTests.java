package test.goit.finalProject.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class FleetTests {
    private FleetWithTestData fleetWithTestData = new FleetWithTestData();

    @Test
    public void createAllBoeingPlanOrderTest() throws Exception{
        assertNotNull(fleetWithTestData.createAllBoeingPlanOrderTest());
    }

    @Test
    public void createAllBoeingHelicopterOrderTest() throws Exception{
        assertNotNull(fleetWithTestData.createAllBoeingPlanOrderTest());
    }

    @Test
    public void createAllBoeingAerostatTest() throws Exception {
        assertNotNull(fleetWithTestData.createAllBoeingAerostatTest());
    }

    @Test
    public void createAllSikorskyPlanOrderTest() throws Exception{
        assertNotNull(fleetWithTestData.createAllSikorskyPlanOrderTest());
    }

    @Test
    public void createAllSikorskyHelicopterOrderTest() throws Exception{
        assertNotNull(fleetWithTestData.createAllSikorskyHelicopterOrderTest());
    }

    @Test
    public void commonFleetTest() throws Exception{
        assertNotNull(fleetWithTestData.commonFleetTest());
    }

    @Test
    public void summarySeatingCapacity() throws Exception {
        assertEquals(4631, fleetWithTestData.summarySeatingCapacityTest().intValue());
    }

    @Test
    public void summaryWeightLift() throws Exception {
        assertEquals(24500, fleetWithTestData.summaryWeightLiftTest().intValue());
    }

    @Test
    public  void findPlaneByFuelEnduranceTest() throws Exception{
        String[] arrayWithBoeing737Name = {"Boeing 737"};
        String[] arrayString = new String[1];
        for (int i = 0; i < fleetWithTestData.findPlaneByFuelEnduranceTest(300, 400).size(); i++){
            arrayString[0] = fleetWithTestData.findPlaneByFuelEnduranceTest(300, 400).get(i).getAircraftName();
        }
        assertArrayEquals(arrayWithBoeing737Name,arrayString);
    }
}
