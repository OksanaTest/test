package test.goit.finalProject.model;

import com.goit.finalProject.projectCode.model.Helicopter;
import com.goit.finalProject.projectCode.model.Plane;
import com.goit.finalProject.projectCode.model.SikorskyAircraftCreationFactory;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SikorskyAircraftCreationFactoryTests {
    private SikorskyAircraftCreationFactory sikorskyAircraftCreationFactory = new SikorskyAircraftCreationFactory();
    private String[] arrayWithNameSikorskyS_44 = {"Sikorsky S - 44"};
    private String[] arrayWithNameSikorskyR_6 = {"Sikorsky R - 6"};
    private String[] arrayWithName = new String[1];

    @Test
    public void createPlane() {
        List<Plane> sikorskyS_44List;
        sikorskyS_44List = sikorskyAircraftCreationFactory.createPlane("Sikorsky S-44", 1);
        for (int i = 0; i < sikorskyS_44List.size(); i++) {
            arrayWithName[i] = sikorskyS_44List.get(i).getAircraftName();
        }
        assertEquals(1, sikorskyS_44List.size());
        assertArrayEquals(arrayWithName, arrayWithNameSikorskyS_44);

    }
    @Test
    public void createHelicopter() {
        List<Helicopter> sikorskyR_6List;
        sikorskyR_6List = sikorskyAircraftCreationFactory.createHelicopter("Sikorsky R-6", 1);
        for (int i = 0; i < sikorskyR_6List.size(); i++) {
            arrayWithName[i] = sikorskyR_6List.get(i).getAircraftName();
        }
        assertEquals(1, sikorskyR_6List.size());
        assertArrayEquals(arrayWithName, arrayWithNameSikorskyR_6);

    }
}
