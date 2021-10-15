/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.io.File;
import java.io.FileInputStream;
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
        firstName = first;
        lastName = last;
        salary = salaryAmt;
    }
}

class EmployeeSort{

    //Create a treemap for sorting
    protected TreeMap<String, Employee> employees = new TreeMap<>();

    /*This class only consists of two methods due to how the names are parsed and recorded.
     A similar methodology was used from the previous example and as such a similar implementation is used
     Splitting the methods which simply record as read and print as recorded into separate functions would be redundant*/
    public void placeEmployeesInMap(File fileName){
        //In try statement to catch bad file paths
        try (Scanner fileIn = new Scanner(new FileInputStream(fileName))){
            String employeeString;
            String[] employeeData;
            //for the number of lines
            while(fileIn.hasNextLine()){
                //Scan in first and last name as a line
                employeeString = fileIn.nextLine();
                //Split names into parts by using split(",")
                employeeData = employeeString.split(",");
                //Add first and last name to person instance
                Employee p = new Employee(employeeData[1],employeeData[0],employeeData[2]);
                //Add first and last name into a map entry
                employees.put(employeeData[0] + ", " + employeeData[1], p);
            }
        } catch (Exception defaultEx){
            //Print error message
            System.out.printf("Unable to parse file%n");
        }
    }

    public void printEmployees(){
        //Print table header
        System.out.printf(" Last name\t First name\t Salary%n");
        //Print tabular break
        System.out.printf("-----------------------------------------%n");
        //For the length of the treemap
        for (Map.Entry<String, Employee> entry : employees.entrySet()){
            //Get the person instance from the treemap
                //Repeated keys will be overridden
            Employee temp = entry.getValue();
            //Set data to string variables
            String first = temp.firstName;
            String last = temp.lastName;
            String salaryAmt = temp.salary;
            //Print the last name, first name, and salary
            System.out.printf("%10s%10s%10s%n", last, first, salaryAmt);
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
        //Open a file instance
        File file = new File("./data/exercise42_input.txt");
        //Create EmployeeSort instance
        EmployeeSort emp = new EmployeeSort();
        //Call name scanning method
        emp.placeEmployeesInMap(file);
        //Call method to print the names
        emp.printEmployees();
    }
}
