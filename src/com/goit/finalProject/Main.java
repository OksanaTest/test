package com.goit.finalProject;

import com.goit.finalProject.exceptions.NegativeQuantityException;
import com.goit.finalProject.exceptions.UnexpectedVendorNameException;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws Exception {
            try{Controller controller = new Controller();
                controller.controller();}
            catch(ClassCastException e){
                System.err.println("[ERROR]:WRONG AIrCraftOrder FILE STRUCTURE");
            }catch (FileNotFoundException e){
                System.err.println("[ERROR]: ORDER FILE CAN NOT BE READ");
            }catch (IOException e){
                StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
                for(StackTraceElement element: stackTraceElements){
                    System.err.println(element);
                }
                System.err.println("[ERROR]: PROBLEM WITH READ/WRITE DATA FROM/TO SOME FILES");
            }catch (NullPointerException e){
                System.err.println("[ERROR]: SOME AIRCRAFTS PARAMETERS ARE NULL");
            }catch(UnexpectedVendorNameException e){
            }catch(NegativeQuantityException e){
            }catch (ParseException e){
                System.err.println("[ERROR]: SOME MISTAKE IN THE ORDER FILE");
            }
            catch (Exception e){
                System.err.println("[ERROR]: SOME ERROR IS OCCUR");
            }
    }
}

