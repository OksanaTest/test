package com.goit.finalProject.projectCode.exceptions;

public class UnexpectedVendorNameException extends RuntimeException{
    public UnexpectedVendorNameException()
    {
        System.err.println("[WARNING]: UNEXPECTED VENDOR NAME IN THE AirCraftOrder.json FILE ");
    }
}

