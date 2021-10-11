/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Employee {
    //This class functions as a data structure, containing a person's first name, last name, and salary as a string
    protected String lastName;
    protected String firstName;
    protected String salary;

    //Constructor to set string values
    public Employee(String first, String last, String salaryAmt){
        firstName;
        lastName;
        salary;
    }
}

class EmployeeSort{

    //Create a treemap for sorting
    protected TreeMap<String, Employee> employees = new TreeMap<>();

    public void placeEmployeesInMap(File fileName){
        //In try statement to catch bad file paths
        try (Scanner fileIn = new Scanner()){
            String nameString;
            String[] fullName;
            //for the number of lines
            while(fileIn.hasNextLine()){
                //Scan in first and last name as a line
                nameString = fileIn.nextLine();
                //Split names into parts by using split(",")
                fullName = nameString.split();
                //Add first and last name to person instance
                Employee p = new Employee();
                //Add first and last name into a map entry

            }
        } catch (Exception defaultEx){
            //Print error message
            System.out.printf("%n");
        }
    }

    public void printEmployee(){
        //Print table header
        System.out.printf("%n");
        //Print tabular break
        System.out.printf("%n");
        //For the length of the treemap
        for (){
            //Get the person instance from the treemap
                //Repeated keys will be overridden
            Employee temp;
            //Set data to string variables
            String first;
            String last;
            String salaryAmt;
            //Print the last name, first name, and salary
            System.out.printf("%n");
        }
    }

    //Get method for unit testing
    public SortedMap<String, Employee> getTreeMap(){
        //Return employee map
        return employees;
    }
}

public class Solution42 {
    public static void main(String[] args){
        //Open a file instance and stream output instance
        File file = new File();
        PrintStream fileOut = new PrintStream();
        //Set program to print to file
        System.setOut(fileOut);
        //Create nameSort instance

        //Call name scanning method

        //Call method to print the names

    }
}
