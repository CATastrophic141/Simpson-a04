/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

class StringReplacer {
    String fileString;

    void convertFileToString(File fileName) {
        StringBuilder writer = new StringBuilder();
        //In try statement to catch bad file pathing
        try () {
            //While there are lines in the file
            while () {
                //Add the line to the string
                writer.append();
                //Add new line character to the string if there is a next line
                if () {
                    writer.append();
                }
            }
        } catch (Exception defaultEx) {
            //Print error message
            System.out.printf("%n");
        }
        //Covert string builder to actual string and then pass it to fileString
        fileString;
    }

    String replaceSubString(String fullString, String wordToReplace, String newWord) {
        //In the full string, replace the old substring with new substring
        return fullString.replace();
    }

    void writeToNewFile(String fullString) {
        Scanner input = new Scanner(System.in);
        //Prompt for name of new file
        System.out.printf("%n");
        //Save user input to string
        String outFileName;
        //Open output file
        File fileOut;
        //Set system print path
        System.setOut();
        //Print string to print
        System.out.printf("%n");
    }
}


public class Solution45 {
    public static void main(String[] args){
        StringReplacer replace = new StringReplacer();
        //Open input file
        File fileIn;
        //Call file conversion method
        replace.convertFileToString();
        //Call substring replacer method
        replace.replaceSubString();
        //Call printing method
        replace.writeToNewFile();
    }
}
