/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

class Person{
    //This class functions as a data structure, containing a person's first and last name as a string
    protected String lastName;
    protected String firstName;

    //Constructor to set string values
    public Person(String first, String last){
        firstName = first;
        lastName = last;
    }
}

class NameSort{

    //Create a treemap for sorting
    protected TreeMap<String, Person> names = new TreeMap<>();

    public void placeNamesInMap(File fileName){
        //In try statement to catch bad file paths
        try (Scanner fileIn = new Scanner(new FileInputStream(fileName))){
            String nameString;
            String[] fullName;
            //for the number of lines
            while(fileIn.hasNextLine()){
                //Scan in first and last name as a line
                nameString = fileIn.nextLine();
                //Split names into parts by using split(",")
                fullName = nameString.split(", ");
                //Add first and last name to person instance
                Person p = new Person(fullName[1], fullName[0]);
                //Add first and last name into a map entry
                names.put(fullName[0] + ", " + fullName[1], p);
            }
        } catch (Exception defaultEx){
            //Print error message
            System.out.printf("File could not be found/Read%n");
        }
    }

    public void printNames(){
        //Print how many names were in the list
        System.out.printf("There are %d names%n", names.size());
        //Print tabular break
        System.out.printf("----------------%n");
        //For the length of the treemap
        for (Map.Entry<String, Person> entry : names.entrySet()){
            //Get the person instance from the treemap
                    //Repeated keys will be overridden
            Person temp = entry.getValue();
            //Set first and last name to strings
            String first = temp.firstName;
            String last = temp.lastName;
            //Print the last name, followed by the fist name
            System.out.printf("%s, %s%n", last, first);
        }
    }

    //Get method for unit testing
    public SortedMap<String, Person> getTreeMap(){
        //Return map
        return names;
    }
}

public class Solution41 {
    public static void main(String[] args) throws FileNotFoundException {
        //Open a file instance and stream output instance
        File file = new File("./data/exercise41_input.txt");
        PrintStream fileOut = new PrintStream("./data/exercise41_output.txt");
        //Set program to print to file
        System.setOut(fileOut);
        //Create nameSort instance
        NameSort nameSort = new NameSort();
        //Call name scanning method
        nameSort.placeNamesInMap(file);
        //Call method to print the names
        nameSort.printNames();
    }
}
