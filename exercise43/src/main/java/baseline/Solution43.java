package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;

class HTMLGenerator {

    String[] siteInfo = {"", ""};
    boolean[] folders = {false, false};

    private boolean checkForYes (String input) {
        //If input is y or Y, return true
        if () {

        }
        //Else return/keep false
        else {

        }
    }

    //This method sets the values for the instance variables
    void promptSiteInfo () {
        Scanner input = new Scanner(System.in);
        //Prompt user for site name
        System.out.printf("%n");
        //Save user input
        siteInfo[0];
        //Prompt user for site author
        System.out.printf("%n");
        //Save user input
        siteInfo[1];
        //Prompt user for if they want java folder
        System.out.printf("%n");
        //Save user input
        folders[0];
        //Prompt user for css file
        System.out.printf("%n");
        //Save user input
        folders[1];
    }

    void generateSiteData() {
        //Make directory for website data
        new File ();
        //Print creation verification
        //Make html file
        new File ();
        //Print creation verification
    }

    void writeToSite() {
        //Create new file object with relative path
        File file = new File("");
        //Create buffered writer
        BufferedWriter writer;
        //Write website name and author to html file
        writer.write();
    }

    void generateDirectories() {
        //If user chose to make java directory, create new directory
        if(){
            new File ();
            //Print creation verification
        }
        //If user chose to make css directory, create new directory
        if(){
            new File ();
            //Print creation verification
        }
    }

}

public class Solution43 {
    public static void main(String[] args) {
        //Call prompt info method
        //Call site directory generation
        //Call html writing method
        //Call directory generation method
    }
}
