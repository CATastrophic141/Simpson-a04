/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

class CatalogueSearcher {

    HashMap<String, double[]> catalogue = new HashMap<>();
    private String foundItemName;
    private double[] foundItemDetails;

    //Moving this method into its own class would result in the created class only containing once method, which increases useless redundancy
    private static String readFileAsString(String file)throws IOException {
        //Return the file stream as a string
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    void parseJSONCatalogue(String filePath){
        try {
            //Manually parse entire JSON file as string object
                    //Using parser object/method fails in JSONObject retrieval due to conflicting casting types.
                        //.simple and regular JSONObject imports cannot be used in parallel
            String fileString = readFileAsString(filePath);
            //Create JSON object from the parsed json file to parse object into retrievable information

                    //JSONObject requires a string of JSON format
            JSONObject jObj = new JSONObject(fileString);
            //Establish the "products" JSON array to parse the individual items
            JSONArray jArr = jObj.getJSONArray("products");

            //For the length of the JSON array
            for (int i = 0; i<jArr.length(); i++){
                //Parse the individual JSON array object
                JSONObject item = jArr.getJSONObject(i);
                //Retrieve the name string
                String itemName = item.getString("name");
                //Retrieve the price and quantity
                double[] itemDetails = {item.getDouble("price"), item.getDouble("quantity")};
                //Set name and details into map item
                catalogue.put(itemName, itemDetails);
            }
        } catch (Exception e) {
            //Print error message if information retrieval fails
            System.out.printf("Could not open/parse file%n");
        }
    }

    private boolean isInCatalogue(String itemName){
        //If the item is a key in the hashmap
        return catalogue.containsKey(itemName);
    }

    void findItem() {
        Scanner input = new Scanner(System.in);
        //Prompt user for item name
        System.out.printf("What is the item you are looking for?%n");
        //Save user input
        String searchItem = input.next();
        //While user input does not match key in map
                //Use !isInCatalogue
        while(!isInCatalogue(searchItem)){
            //Print error
            System.out.printf("Sorry, that item does not exist in the catalogue%n");
            //Buffer input
            input.nextLine();
            //Prompt user for input again
            System.out.printf("What is the item you are looking for?%n");
            //Save user input
            searchItem = input.next();
        }
        //Retrieve matched map item
        foundItemName = searchItem;
        foundItemDetails = catalogue.get(searchItem);
    }

    void printFoundItem(){
        //Print item name, price, and quantity
        System.out.printf("Item: %s%nPrice: %.2f%nQuantity: %.0f", foundItemName, foundItemDetails[0], foundItemDetails[1]);
    }
}

public class Solution44 {
    public static void main (String[] args){
        String filePath = "./data/exercise44_input.json";
        CatalogueSearcher search = new CatalogueSearcher();
        //Call JSON parser
        search.parseJSONCatalogue(filePath);
        //Call item finder method
        search.findItem();
        //Call found item printer
        search.printFoundItem();
    }
}
