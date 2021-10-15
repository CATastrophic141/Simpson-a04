package baseline;


import org.json.JSONArray;
//import org.json.JSONObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CatalogueSearcherTest {
    @Test
    void testJsonNumItems() throws IOException, ParseException {
        JSONParser parserTest = new JSONParser();
        File fileTest = new File("./data/exercise44_input.json");
        Object fileParse = parserTest.parse(new FileReader(fileTest));
        JSONObject jObjTest = (JSONObject)fileParse;
        assertEquals(3, jObjTest.);
        }
}