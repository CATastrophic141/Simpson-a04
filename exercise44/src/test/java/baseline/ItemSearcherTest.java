package baseline;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CatalogueSearcherTest {

    private static String readFileAsString(String file)throws IOException {
        //Return the file stream as a string
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    @Test
    void testJsonNumItems() throws IOException {
        String filePath = "./data/exercise44_input.json";
        String fileString = readFileAsString(filePath);
        JSONObject jObjTest = new JSONObject(fileString);
        JSONArray jArrTest = jObjTest.getJSONArray("products");
        assertEquals(3, jArrTest.length());
        }

    @Test
    void testKey_parseJSONCatalogue() {
        CatalogueSearcher test = new CatalogueSearcher();
        test.parseJSONCatalogue("./data/exercise44_input.json");
        assertTrue(test.catalogue.containsKey("Thing"));
    }

    @Test
    void testValue1_parseJSONCatalogue() {
        CatalogueSearcher test = new CatalogueSearcher();
        test.parseJSONCatalogue("./data/exercise44_input.json");
        double[] testArr = test.catalogue.get("Thing");
        assertEquals(15.00, testArr[0]);
    }

    @Test
    void testValue2_parseJSONCatalogue() {
        CatalogueSearcher test = new CatalogueSearcher();
        test.parseJSONCatalogue("./data/exercise44_input.json");
        double[] testArr = test.catalogue.get("Thing");
        assertEquals(5.00, testArr[1]);
    }
}