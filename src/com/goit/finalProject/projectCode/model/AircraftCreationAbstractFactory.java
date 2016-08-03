package com.goit.finalProject.projectCode.model;


import java.util.List;

public interface AircraftCreationAbstractFactory {
    List<Plane> createPlane(String namePlan, int quantity);
    List<Helicopter> createHelicopter(String helicopterName, int quantity);
}
