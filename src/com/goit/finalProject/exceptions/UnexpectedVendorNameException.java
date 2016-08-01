package com.goit.finalProject.exceptions;

public class UnexpectedVendorNameException extends RuntimeException{
    public UnexpectedVendorNameException()
    {
        System.err.println("[WARNING]: UNEXPECTED VENDOR NAME IN THE AirCraftOrder.json FILE ");
    }
}

