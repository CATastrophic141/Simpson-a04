/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class NameSort{

    //Create a treemap for sorting and a variable to store the number of names
    private TreeMap<String, String> names = new TreeMap<>();
    private int numberOfNames;

    //Count how name lines exist within the input file
    private int countNumberOfNames(String fileName) {
        int numLines = 0;
        //In try statement to catch reading error
            //Create a buffered reader object to read from the passed file
        try (BufferedReader fileIn = new BufferedReader(new FileReader(fileName))){
            while (){
                //Increment line number counter
            }
            //If file is not read properly
        } catch (IOException e) {
            //Print error message
            System.out.printf("%n");
        }
        //Return the number of lines counted
        return numLines;
    }

    private void placeNamesInMap(String fileName){
        Scanner fileIn = new Scanner(fileName);
        String nameString;
        String[] fullName;
        //for the number of lines
        for(){
            //Scan in first and last name as a line
                //Split names into parts by using split(",")
            //Add first and last name into a map entry
        }
    }

    public void scanNames(String fileName){
        //Call name counting method to determine number of names to scan
        int numPeople;
        //Call in method to place names in String
    }

    public void printNames(){
        //Print how many names were in the list
        System.out.printf("%n");
        //Print tabular break
        System.out.printf("%n");
        //For the length of the treemap
        for(){
            //Print the last name, followed by the fist name
        }
    }

}

public class Solution41 {
    public static void main(String[] args){
        //Create nameSort instance
        //Establish name of read file
        String file;
        //Call number of name finding method, save to instance variable

        //Call method to save names to treemap

        //Call method to print the names

    }
}
