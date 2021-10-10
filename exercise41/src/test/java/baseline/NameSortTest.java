package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Map;
import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.*;

class NameSortTest {

    NameSort test = new NameSort();

    @Test
    void testFirstName() {
        //This test evaluates the program's ability to retrieve stored information from the map
        String first = "";
        String fileDirectory = "./data/exercise41_input.txt";
        File file = new File(fileDirectory);
        test.placeNamesInMap(file);
        SortedMap<String, Person> mapTest;
        mapTest = test.getTreeMap();

        //This loop retrieves an expected string
        for (Map.Entry<String, Person> entry : mapTest.entrySet()){
            Person temp = entry.getValue();
            first = temp.firstName;
        }
        assertEquals("Sabrina", first);
    }

    @Test
    void testLastName() {
        //This test evaluates the program's ability to retrieve stored information from the map
        String last = "";
        String fileDirectory = "./data/exercise41_input.txt";
        File file = new File(fileDirectory);
        test.placeNamesInMap(file);
        SortedMap<String, Person> mapTest;
        mapTest = test.getTreeMap();

        //This loop retrieves an expected string
        for (Map.Entry<String, Person> entry : mapTest.entrySet()){
            Person temp = entry.getValue();
            last = temp.lastName;
        }
        assertEquals("Zarnecki", last);
    }

    @Test
    void testKey() {
        //This test evaluates the program's ability to retrieve stored information from the map
        String fullName = "";
        String fileDirectory = "./data/exercise41_input.txt";
        File file = new File(fileDirectory);
        test.placeNamesInMap(file);
        SortedMap<String, Person> mapTest;
        mapTest = test.getTreeMap();

        //This loop retrieves an expected string
        for (Map.Entry<String, Person> entry : mapTest.entrySet()){
            fullName = entry.getKey();
        }
        assertEquals("Zarnecki, Sabrina", fullName);
    }

}