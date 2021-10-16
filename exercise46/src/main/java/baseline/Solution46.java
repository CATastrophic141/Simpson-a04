/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.io.File;
import java.util.*;

class WordFrequency {

    TreeMap<String, Integer> wordCount = new TreeMap<>();

    void countWords(File fileName) {
        try (Scanner inScan = new Scanner(fileName)) {
            //while the file has another string
            while (inScan.hasNext()) {
                //Get current word as string
                String word = inScan.next();
                //If the string is already a key in the map
                if (wordCount.containsKey(word)) {
                    //Increment the map value by 1
                  wordCount.put(word, wordCount.get(word) + 1);
                }
                //else, add a map entry with the string as a key and the value starting at one
                else {
                    wordCount.put(word, 1);
               }
            }
        }
        catch (Exception e){
            System.out.printf("Could not read file%n");
        }
    }

    void printResults() {
        //For each entry int the map
        Map<String,Integer> sortedWords = convertToSortedMap(wordCount);
        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            //Print the key string
            System.out.printf("%10s: ", entry.getKey());
            //For the integer stored in the map
            for (int j = 0; j<entry.getValue(); j++) {
                //Print a *
                System.out.print("*");
            }
            //Buffer table
            System.out.printf("%n");
        }
    }

    private LinkedHashMap<String, Integer> convertToSortedMap(TreeMap<String, Integer> words) {
        //LinkedHashMap preserve the ordering of elements in which they are inserted
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        //Sort the map based on value integer, descending
        words.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        //Return the sortedmap
        return sortedMap;
    }
}

public class Solution46 {
    public static void main(String[] args){
        WordFrequency freq = new WordFrequency();
        //Open file
        File fileIn = new File("./data/exercise46_input.txt");
        //Call word counting method
        freq.countWords(fileIn);
        //Call result printing method
        freq.printResults();
    }
}