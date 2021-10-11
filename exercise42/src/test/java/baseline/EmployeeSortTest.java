package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Map;
import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSortTest {

    EmployeeSort test = new EmployeeSort();

    @Test
    void testFirstName() {
        //This test evaluates the program's ability to retrieve stored information from the map
        String first = "";
        File file = new File("./data/exercise42_input.txt");
        test.placeEmployeesInMap(file);
        SortedMap<String, Employee> mapTest;
        mapTest = test.getTreeMap();

        //This loop retrieves an expected string
        for (Map.Entry<String, Employee> entry : mapTest.entrySet()){
            Employee temp = entry.getValue();
            first = temp.firstName;
        }
        assertEquals("Sabrina", first);
    }

    @Test
    void testLastName() {
        //This test evaluates the program's ability to retrieve stored information from the map
        String last = "";
        File file = new File("./data/exercise42_input.txt");
        test.placeEmployeesInMap(file);
        SortedMap<String, Employee> mapTest;
        mapTest = test.getTreeMap();

        //This loop retrieves an expected string
        for (Map.Entry<String, Employee> entry : mapTest.entrySet()){
            Employee temp = entry.getValue();
            last = temp.lastName;
        }
        assertEquals("Zarnecki", last);
    }

    @Test
    void testSalary() {
        //This test evaluates the program's ability to retrieve stored information from the map
        String salaryAmt = "";
        File file = new File("./data/exercise42_input.txt");
        test.placeEmployeesInMap(file);
        SortedMap<String, Employee> mapTest;
        mapTest = test.getTreeMap();

        //This loop retrieves an expected string
        for (Map.Entry<String, Employee> entry : mapTest.entrySet()){
            Employee temp = entry.getValue();
            salaryAmt = temp.salary;
        }
        assertEquals("51500", salaryAmt);
    }

    @Test
    void testKey() {
        //This test evaluates the program's ability to retrieve stored information from the map
        String fullName = "";
        File file = new File("./data/exercise42_input.txt");
        test.placeEmployeesInMap(file);
        SortedMap<String, Employee> mapTest;
        mapTest = test.getTreeMap();

        //This loop retrieves an expected string
        for (Map.Entry<String, Employee> entry : mapTest.entrySet()){
            fullName = entry.getKey();
        }
        assertEquals("Zarnecki, Sabrina", fullName);
    }
}