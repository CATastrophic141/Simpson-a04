/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import com.google.gson.stream.JsonReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.*;
import java.util.HashMap;


/*class CatalogueSearcher {

    HashMap<String ,String[]> catalogue = new HashMap<>();
    private String foundItemName;
    private String[] foundItemDetails;

    void parseJSONCatalogue(){
        //Create parser object
        JSONParser parser = new JSONParser();
        //Open JSON file
        File file = new File("./exercise44/data/exercise44_input.json");
        try {
            Object fileParse = parser.parse(new FileReader(file));
            JSONObject jObj = (JSONObject)fileParse;
            //For the length of the number of entries in the file
            for (int i = 0; 0<((JSONObject) fileParse).size(); i++) {
                //Save first item as map key string
                String key;
                //Save entry as string array into map value
                String[] info;
                //Enter data into map item
                //catalogue.put();
            }
        } catch (IOException | ParseException e) {
            System.out.printf("Could not open/parse file%n");
        }
    }

    private boolean isInCatalogue(String itemName){
        //If the item is a key in the hashmap
        return true;
    }

    void findItem() {
        //Prompt user for item name
        System.out.printf("%n");
        //Save user input
        //While user input does not match key in map
                //Use !isInCatalogue
        //while(){
            //Print error
            System.out.printf("%n");
            //Buffer input

            //Prompt user for input again
            System.out.printf("%n");
            //Save user input
        //}
        //Retrieve matched map item
        //foundItemName = "";
        //foundItemDetails = "";
    }

    void printFoundItem(){
        //Print item name, price, and quantity
        System.out.printf("%n");
    }
}*/

public class Solution44 {
    public static void main (String[] args){
        //Call JSON parser
        //Call item finder method
        //Call found item printer
    }
}
