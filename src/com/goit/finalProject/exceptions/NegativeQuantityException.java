package com.goit.finalProject.exceptions;

public class NegativeQuantityException extends RuntimeException{
    public NegativeQuantityException()
    {
        System.err.println("[ERROR]: SOME AIRCRAFT QUANTITY IN THE AirCraftOrder.json IS NEGATIVE OR 0 ");
    }
}
