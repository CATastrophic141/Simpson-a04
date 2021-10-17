/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class HTMLGenerator {

    String[] siteInfo = {"", ""};
    boolean[] folders = {false, false};

    static final String START = "./data/website/";

    public HTMLGenerator(String webName, String author, String javaChoice, String cssChoice) {
        //Assign strings to website data
        siteInfo[0] = webName;
        siteInfo[1] = author;
        //Check bool values for if user wants to create js/css directories
        folders[0] = checkForYes(javaChoice);
        folders[1] = checkForYes(cssChoice);
    }

    /*All other methods are related regarding website generation.
     Moving this method to its own class would be redundant
     as it would be the only method in that class*/
    private boolean checkForYes (String input) {
        //If input is y or Y, return true
        return input.equals("y") || input.equals("Y");
    }

    void generateSiteData() {
        //Make directory for website data
        File website = new File (START+siteInfo[0]);
        if(website.mkdirs()) {
            //Print creation verification
            if (website.isDirectory()) {
                //Print confirmation message
                System.out.printf("Created %s%s/%n", START, siteInfo[0]);
            } else {
                //Print error message
                System.out.printf("Unable to create directory%n");
            }
        }
    }

    void writeToSite() {
        //Create new file object with relative path
        File file = new File(START+siteInfo[0]+"/index.html");
        //Create buffered writer
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            //Write website name and author to html file
            writer.write("<!DOCTYPE html><html lang=\"en\">\n<head><title>"
                    +siteInfo[0]+"</title></head>\n<meta>"+siteInfo[1]);
            //Write template text
            writer.write("\n<body><h1>\nThis is a template.\n</h1></body>\n</html>");
            //Print confirmation
            System.out.printf("Created %s%s/index.html%n", START, siteInfo[0]);
        } catch (IOException e) {
            //Print error message
            System.out.printf("Unable to write to file%n");
        }
    }

    private void generateDirectory(boolean isFolder, String folderName) {
        String folderDirectoryAsset = "/" + folderName + "/";
        //If user chose to make a directory, create new directory
        if(isFolder){
            File java = new File (START+siteInfo[0]+folderDirectoryAsset);
            //Print creation verification
            if (java.mkdirs()){
                System.out.printf("Created %s%s%s%n" ,START, siteInfo[0], folderDirectoryAsset);
            }
        }
    }

    void manageDirectoryGeneration() {
        //If user chose to make java directory, create new directory
        generateDirectory(folders[0], "js");
        //If user chose to make css directory, create new directory
        generateDirectory(folders[1], "css");
    }

}

public class Solution43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user for site name
        System.out.printf("Please enter the site name:%n");
        String name = input.nextLine();
        System.out.printf("Please enter the site author:%n");
        //Save user input
        String author = input.nextLine();
        System.out.printf("Do you want to generate a JavaScript directory? [Enter \"y\" or \"Y\" to generate]%n");
        //Save user input
        String java = input.nextLine();
        System.out.printf("Do you want to generate a CSS directory? [Enter \"y\" or \"Y\" to generate]%n");
        //Save user input
        String css = input.nextLine();

        //Call constructor
        HTMLGenerator htmlG = new HTMLGenerator(name, author, java, css);
        //Call site directory generation
        htmlG.generateSiteData();
        //Call html writing method
        htmlG.writeToSite();
        //Call directory generation method
        htmlG.manageDirectoryGeneration();
    }
}