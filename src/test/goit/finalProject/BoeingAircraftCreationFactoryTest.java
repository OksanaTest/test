package test.goit.finalProject;

import com.goit.finalProject.Aerostat;
import com.goit.finalProject.BoeingAircraftCreationFactory;
import com.goit.finalProject.Helicopter;
import com.goit.finalProject.Plane;
;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class BoeingAircraftCreationFactoryTest {
    private BoeingAircraftCreationFactory boeingAircraftCreationFactory = new BoeingAircraftCreationFactory();
    private String[] arrayWithNameBoeing777 = {"Boeing 777", "Boeing 777"};
    private String[] arrayWithNameBell47 = {"Bell 47"};
    private String[] arrayWithNameATC07 = {"07 ATC", "07 ATC", "07 ATC"};

    @Test
    public void createPlane() {
        List<Plane> boeing777List;
        boeing777List = boeingAircraftCreationFactory.createPlane("Boeing 777", 2);
        String[] arrayWithName = new String[2];
        for (int i = 0; i < boeing777List.size(); i++){
            arrayWithName[i] = boeing777List.get(i).getAircraftName();
        }
        assertEquals(2, boeing777List.size());
        assertArrayEquals(arrayWithName, arrayWithNameBoeing777);
    }
    @Test
    public void createHelicopter(){
        List<Helicopter> bell47List;
        bell47List = boeingAircraftCreationFactory.createHelicopter("Bell 47", 1);
        String[] arrayWithName = new String[1];
        for (Helicopter aBell47List : bell47List) {
            arrayWithName[0] = aBell47List.getAircraftName();
        }
        assertEquals(1, bell47List.size());
        assertArrayEquals(arrayWithName, arrayWithNameBell47);
    }
    @Test
    public void crateAerostat(){
        List<Aerostat> ATC07List;
        ATC07List = boeingAircraftCreationFactory.crateAerostat("07 ATC", 3);
        String[] arrayWithName = new String[3];
        for (int i = 0; i < ATC07List.size(); i++){
            arrayWithName[i] = ATC07List.get(i).getAircraftName();
        }
        assertEquals(3, ATC07List.size());
        assertArrayEquals(arrayWithName, arrayWithNameATC07);
    }
}

