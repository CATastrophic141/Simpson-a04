package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class StringReplacerTest {
    @Test
    void fileConversionTest() {
        StringReplacer replaceTest = new StringReplacer();
        File testFile = new File("./data/testIn.txt");
        replaceTest.convertFileToString(testFile);
        assertEquals("This is a test string. \"Beans\"", replaceTest.fileString);
    }

    @Test
    void wordReplacerTest() {
        StringReplacer replaceTest = new StringReplacer();
        File testFile = new File("./data/testIn.txt");
        replaceTest.convertFileToString(testFile);
        String newTestString = replaceTest.replaceSubString(replaceTest.fileString, "Beans", "Kiwis");
        assertEquals("This is a test string. \"Kiwis\"", newTestString);
    }

    @Test
    void fileCreationTest() throws FileNotFoundException {
        StringReplacer replaceTest = new StringReplacer();
        replaceTest.writeToNewFile("testFile", "This is a test file, contents do not matter");
        File testFile = new File ("./data/testFile.txt");
        assertTrue(testFile.isFile());
    }
}