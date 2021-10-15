/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

class StringReplacer {
    String fileString;

    void convertFileToString(File fileName) {
        StringBuilder writer = new StringBuilder();
        //In try statement to catch bad file pathing
        try (Scanner fileIn = new Scanner(new FileInputStream(fileName))) {
            //While there are lines in the file
            while (fileIn.hasNextLine()) {
                //Add the line to the string
                writer.append(fileIn.nextLine());
                //Add new line character to the string if there is a next line
                if (fileIn.hasNextLine()) {
                    writer.append("\n");
                }
            }
        } catch (Exception defaultEx) {
            //Print error message
            System.out.printf("Could not read file%n");
        }
        //Covert string builder to actual string and then pass it to fileString
        fileString = writer.toString();
    }

    String replaceSubString(String fullString, String wordToReplace, String newWord) {
        //In the full string, replace the old substring with new substring
        return fullString.replace(wordToReplace, newWord);
    }

    void writeToNewFile(String newFileName, String fullString) throws FileNotFoundException {
        //Save user input to string
        String outFileName = newFileName + ".txt";
        //Open output file
        PrintStream fileOut = new PrintStream("./data/"+outFileName);
        //Set system print path
        System.setOut(fileOut);
        //Print string to print
        System.out.print(fullString);
    }
}


public class Solution45 {
    public static void main(String[] args) throws FileNotFoundException {
        StringReplacer replace = new StringReplacer();
        Scanner input = new Scanner(System.in);
        //Prompt for name of new file
        System.out.printf("What do you want the produced file to be called?%n");
        //Save name of new file
        String newFileName = input.next();
        //Open input file
        File fileIn = new File("./data/exercise45_input.txt");
        //Call file conversion method
        replace.convertFileToString(fileIn);
        //Set replaced/replacer words
        String oldWord = "utilize";
        String newWord = "use";
        //Call substring replacer method
        String alteredString = replace.replaceSubString(replace.fileString, oldWord, newWord);
        //Call printing method
        replace.writeToNewFile(newFileName, alteredString);
    }
}
