package com.goit.finalProject.parser;


import com.goit.finalProject.exceptions.NegativeQuantityException;
import com.goit.finalProject.exceptions.UnexpectedVendorNameException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
Class methods returns Map with aircraft name, count and type (from JSON file) to produce
such aircraft
*/
public class Parser {
    public Map<String, Long> boeingPlanOrderPrepare() throws NullPointerException,IOException, ParseException, ClassCastException {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(new FileReader("AirCraftOrder.json"));
            JSONArray jsonArray = (JSONArray) object;
            Map<String, Long> boeingHelicopterOrder = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if ((!name.equalsIgnoreCase("Boeing"))&&(!name.equalsIgnoreCase("Sikorsky"))){
                throw new UnexpectedVendorNameException();
            }
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object anOrder : order) {
                    JSONObject jsonObject1 = (JSONObject) anOrder;
                    if ((Long) jsonObject1.get("quantity") <= 0 ) throw new NegativeQuantityException();
                    if (((String) jsonObject1.get("aircraftType")).equalsIgnoreCase("Helicopter")) {
                        boeingHelicopterOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return boeingHelicopterOrder;
    }
    public Map<String, Long> boeingHelicopterOrderPrepare() throws NullPointerException,IOException, ParseException, ClassCastException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;
        Map<String, Long> boeingHelicopterOrder = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object anOrder : order) {
                    JSONObject jsonObject1 = (JSONObject) anOrder;
                    if ((Long) jsonObject1.get("quantity") <= 0) throw new NegativeQuantityException();
                    if (((String) jsonObject1.get("aircraftType")).equalsIgnoreCase("Helicopter")) {
                        boeingHelicopterOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return boeingHelicopterOrder;
    }
    public Map<String, Long> boeingAerostatOrderPrepare() throws NullPointerException,IOException, ParseException, ClassCastException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;
        Map<String, Long> boeingAerostatOrder = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Boeing")) {
                for (Object anOrder : order) {
                    JSONObject jsonObject1 = (JSONObject) anOrder;
                    if ((Long) jsonObject1.get("quantity") <= 0) throw new NegativeQuantityException();
                    if (((String) jsonObject1.get("aircraftType")).equalsIgnoreCase("Aerostat")) {
                        boeingAerostatOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return boeingAerostatOrder;
    }
    public Map<String, Long> sikorskyPlanOrderPrepare() throws NullPointerException,IOException, ParseException, ClassCastException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Long> sikorskyPlanOrder = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Sikorsky")) {
                for (Object anOrder : order) {
                    JSONObject jsonObject1 = (JSONObject) anOrder;
                    if ((Long) jsonObject1.get("quantity") <= 0) throw new NegativeQuantityException();
                    if (((String) jsonObject1.get("aircraftType")).equalsIgnoreCase("Plane")) {
                        sikorskyPlanOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return sikorskyPlanOrder;
    }
    public Map<String, Long> sikorskyHelicopterOrderPrepare() throws NullPointerException,IOException, ParseException, ClassCastException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("AirCraftOrder.json"));
        JSONArray jsonArray = (JSONArray) object;

        Map<String, Long> sikorskyHelicopterOrder = new HashMap<>();
        for (Object aJsonArray : jsonArray) {
            JSONObject jsonObject = (JSONObject) aJsonArray;
            String name = (String) jsonObject.get("vendorName");
            JSONArray order = (JSONArray) jsonObject.get("order");
            if (name.equalsIgnoreCase("Sikorsky")) {
                for (Object anOrder : order) {
                    JSONObject jsonObject1 = (JSONObject) anOrder;
                    if ((Long) jsonObject1.get("quantity") <= 0) throw new NegativeQuantityException();
                    if (((String) jsonObject1.get("aircraftType")).equalsIgnoreCase("Helicopter")) {
                        sikorskyHelicopterOrder.put((String) jsonObject1.get("aircraftName"),
                                (Long) jsonObject1.get("quantity"));
                    }
                }
            }
        }
        return sikorskyHelicopterOrder;
    }
}


