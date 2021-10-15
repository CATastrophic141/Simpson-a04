/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;


class ItemSearcher {

    HashMap<String ,String[]> catalogue = new HashMap<>();
    private String foundItemName;
    private String[] foundItemDetails;

    void parseJSONCatalogue(){
        //Open JSON file
        File file = new File();
        //For the length of the number of entries in the file
        for() {
            //Save first item as map key string
            String key;
            //Save entry as string array into map value
            String[] info;
            //Enter data into map item
            catalogue.put();
        }
    }

    private boolean isInCatalogue(String itemName){
        //If the item is a key in the hashmap
        return;
    }

    void findItem() {
        //Prompt user for item name
        System.out.printf("%n");
        //Save user input
        //While user input does not match key in map
                //Use !isInCatalogue
        while(){
            //Print error
            System.out.printf("%n");
            //Buffer input

            //Prompt user for input again
            System.out.printf("%n");
            //Save user input
        }
        //Retrieve matched map item
        foundItemName;
        foundItemDetails;
    }

    void printFoundItem(){
        //Print item name, price, and quantity
        System.out.printf("%n");
    }
}

public class Solution44 {
    public static void main (String[] args){
        //Call JSON parser
        //Call item finder method
        //Call found item printer
    }
}
